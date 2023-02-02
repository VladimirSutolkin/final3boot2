package project.dao;


import project.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User addUser(long id);

    User deleteUser(long id);
}
