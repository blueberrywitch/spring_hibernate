package dika.spring.hibernate.dao;

import dika.spring.hibernate.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}