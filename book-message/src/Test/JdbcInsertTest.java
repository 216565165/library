package Test;

import dao.UserDao;
import model.User;

public class JdbcInsertTest {
    public static  void main(String [] args){
        UserDao ud= new UserDao();
        User user = new User();
        user.setId(6);
        user.setName("yzh");
        user.setPassword("333");
        user.setPhone("12345");
        user.setEmail("12367@qq.com");
        boolean b =ud.insert(user);
        System.out.println(b);
    }
}
