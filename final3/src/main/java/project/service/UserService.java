package project.service;


import project.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(long id);

    void deleteUser(long parseUnsignedInt);

    void createOrUpdateUser(User user);
}
