package ua.artcode.taxi.run;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.DriverDaoInnerDbImpl;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;
import ua.artcode.taxi.service.ServiceUser;
import ua.artcode.taxi.service.UserServiceUserImpl;

import javax.security.auth.login.LoginException;

/**
 * Created by fatum09 on 24.04.2016.
 */
public class runTaxi {
    public static void main(String[] args) {
        AppDB appDB = new AppDB();
        UserDaoInnerDbImpl userDaoInnerDb = new UserDaoInnerDbImpl(appDB);
        User userOne = new User();

        userOne.setPhone("0000000000");
        userOne.setPass("1111");
        userDaoInnerDb.create(userOne);
        String token = "";

        Order orderTest = null;
        DriverDaoInnerDbImpl driverDaoInnerDb = new DriverDaoInnerDbImpl(appDB);

        UserServiceUserImpl serviceUser = new UserServiceUserImpl(userDaoInnerDb);

        try {
            token = serviceUser.login("0000000000","1111");

        } catch (LoginException e) {
            e.printStackTrace();
        }

        try {
            orderTest = serviceUser.makeOrder(token,"Киев, Победы, 10","Днепропетровск, Победы, 10");
        } catch (OrderMakeException e) {
            e.printStackTrace();
        }


        System.out.println(orderTest.getDistance());

    }
}
