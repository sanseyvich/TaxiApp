package ua.artcode.taxi.run;

import ua.artcode.taxi.dao.AbstractUserDao;
import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.DriverDaoInnerDbImpl;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.model.Driver;
import ua.artcode.taxi.model.User;
import ua.artcode.taxi.service.UserService;
import ua.artcode.taxi.service.UserServiceImpl;

public class StartApp {


    public static void main(String[] args) {
        AppDB DB = new AppDB();
        AbstractUserDao <User> userDB = new UserDaoInnerDbImpl(DB);
        AbstractUserDao <Driver> driverDB = new DriverDaoInnerDbImpl(DB);

        UserService userService = new A(new UserDaoInnerDbImpl(new AppDB()));
        //

    }
}
