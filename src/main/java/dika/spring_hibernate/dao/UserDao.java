package dika.spring_hibernate.dao;

import dika.spring_hibernate.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}