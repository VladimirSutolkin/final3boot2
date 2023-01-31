package project.dao;


import project.model.User;

import java.util.List;

public interface Dao {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User readUser(long id);

    User deleteUser(long id);
}
