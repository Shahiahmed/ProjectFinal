package kz.iitu.edu.booking.repository;

import kz.iitu.edu.booking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> getAllBy();
    User getUserById(Integer id);
    User getFirstByUsername(String s);

}
