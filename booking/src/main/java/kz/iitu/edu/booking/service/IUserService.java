package kz.iitu.edu.booking.service;

import kz.iitu.edu.booking.model.User;

import java.util.List;

public interface IUserService {

    void create(User user);
    void delete(Integer id);
    List<User> getAllUsers();
    User getUserById(Integer id);

}
