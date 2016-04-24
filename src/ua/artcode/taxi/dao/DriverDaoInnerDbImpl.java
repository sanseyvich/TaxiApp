package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Driver;

import java.util.Collection;

/**
 * Created by olsas on 4/24/2016.
 */
public class DriverDaoInnerDbImpl implements AbstractUserDao<Driver> {

    private AppDB appDB;

    public DriverDaoInnerDbImpl(AppDB appDB) {
        this.appDB = appDB;
    }

    @Override
    public Driver create(Driver user) {
        return appDB.addDriver(user);
    }

    @Override
    public Collection<Driver> getAll() {
        return appDB.getDrivers();
    }

    @Override
    public Driver findByPhone(String phone) {
        return appDB.findDriver(phone);
    }

    @Override
    public Driver findById(int id) {
        return appDB.findDriverById(id);
    }

    @Override
    public Driver delete(int id) {
        return appDB.deleteDriver(id);
    }

    @Override
    public Driver update(Driver newDriver) {
        return null;
    }
}

