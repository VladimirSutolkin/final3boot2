package project.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.model.User;
import project.dao.UserDao;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
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
        userDao.createUser(user);
    }

    private void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getUser(long id) {
        return userDao.addUser(id);
    }

    @Override
    public void deleteUser(long id) {
        User user = null;
        try {
            user = userDao.deleteUser(id);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
