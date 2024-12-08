package dika.spring_hibernate.service;

import dika.spring_hibernate.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}
