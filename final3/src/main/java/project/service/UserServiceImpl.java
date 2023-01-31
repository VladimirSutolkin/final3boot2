package project.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.model.User;
import project.repository.Dao;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final Dao dao;

    public UserServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public void createOrUpdateUser(User user) {
        if (0 == user.getId()) {
            createUser(user);
        } else {
            updateUser(user);
        }
    }

    private void createUser(User user) {
        dao.createUser(user);
    }

    private void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public User readUser(long id) {
        return dao.readUser(id);
    }

    @Override
    public User deleteUser(long id) {
        User user = null;
        try {
            user = dao.deleteUser(id);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return user;
    }
}
