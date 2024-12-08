package dika.spring.hibernate.service;

import dika.spring.hibernate.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}
