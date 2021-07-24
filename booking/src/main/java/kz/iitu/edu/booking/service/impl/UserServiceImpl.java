package kz.iitu.edu.booking.service.impl;

import kz.iitu.edu.booking.model.User;
import kz.iitu.edu.booking.repository.UserRepository;
import kz.iitu.edu.booking.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void create(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.saveAndFlush(user);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.getAllBy();
    }

    @Override
    public User getUserById(Integer id) {
        return repository.getUserById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = repository.getFirstByUsername(s);

        if (user == null) {
            throw new UsernameNotFoundException("User: " + s + " not found!");
        }
        return user;
    }
}
