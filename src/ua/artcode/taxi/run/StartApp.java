package ua.artcode.taxi.run;

import ua.artcode.taxi.dao.AppDB;
import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.service.ServiceUser;
import ua.artcode.taxi.service.UserServiceUserImpl;

public class StartApp {


    public static void main(String[] args) {
<<<<<<< HEAD
        ServiceUser userService = new UserServiceUserImpl(new UserDaoInnerDbImpl(new AppDB()));
=======
       UserService userService = new UserServiceImpl(new UserDaoInnerDbImpl(new AppDB()));
>>>>>>> e83d55e0e6eb3d6af6ca2b1903b802304394b97f
        //

    }
}
