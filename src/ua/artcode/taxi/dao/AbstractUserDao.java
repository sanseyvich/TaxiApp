package ua.artcode.taxi.dao;

import java.util.Collection;

/**
 * Created by olsas on 4/24/2016.
 */
public interface AbstractUserDao<T extends AbstractUser>{
    // return user with id
    T create(T AbsUser);

    Collection<T> getAll();

    T findByPhone(String phone);

    T findById(int id);

    T delete(int id);

    T update(T newUser);
}