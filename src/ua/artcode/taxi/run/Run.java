package ua.artcode.taxi.run;

import ua.artcode.taxi.dao.AbstractUserDao;
import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.DriverDaoInnerDbImpl;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.service.DriverServiceUserImpl;
import ua.artcode.taxi.service.ServiceUser;
import ua.artcode.taxi.service.UserService;
import ua.artcode.taxi.service.UserServiceImpl;
import ua.artcode.taxi.service.UserServiceUserImpl;
import ua.artcode.taxi.view.MainFrame;
import ua.artcode.taxi.view.MakeOrderFrame;

public class Run {


    public static void main(String[] args) {
        AppDB DB = new AppDB();
        UserDaoInnerDbImpl userDB = new UserDaoInnerDbImpl(DB);
        DriverDaoInnerDbImpl driverDB = new DriverDaoInnerDbImpl(DB);


        ServiceUser serviceUser = new UserServiceUserImpl(userDB);
        //ServiceUser serviceDriver = new DriverServiceUserImpl(driverDB);

    }
}
