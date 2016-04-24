package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.User;
import java.util.Collection;

/**
 * Created by serhii on 23.04.16.
 */
public class UserDaoInnerDbImpl implements AbstractUserDao<User> {

    private AppDB appDB;

    public UserDaoInnerDbImpl(AppDB appDB) {
        this.appDB = appDB;
    }

    @Override
    public User create(User user) {
        return appDB.addUser(user);
    }

    @Override
    public Collection<User> getAll() {
        return appDB.getUsers();
    }

    @Override
    public User findByPhone(String phone) {
        return appDB.findUser(phone);
    }

    @Override
    public User findById(int id) {
        return appDB.findUserById(id);
    }

    @Override
    public User delete(int id) {
        return appDB.deleteUser(id);
    }

    @Override
    public User update(User newUser) {
        return null;
    }
}
