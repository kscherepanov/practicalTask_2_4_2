package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(Long id);

    User getByEmail(String email);

    User getByUserName(String username);

    void delete(Long id);

    void update(User user);

    void create(User user);
}
