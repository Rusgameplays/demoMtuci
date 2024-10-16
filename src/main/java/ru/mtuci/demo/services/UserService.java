package ru.mtuci.demo.services;

import ru.mtuci.demo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    List<User> getAll();
    void add(User user);
    User getById(UUID id);
    User getByName(String name);
}
