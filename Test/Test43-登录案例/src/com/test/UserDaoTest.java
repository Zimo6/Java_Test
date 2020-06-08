package com.test;

import com.dao.UserDao;
import com.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        UserDao dao = new UserDao();

        User u = new User();
        u.setUsername("cui");
        u.setPassword("123456");
        User user = dao.login(u);

        System.out.println(user);
    }
}
