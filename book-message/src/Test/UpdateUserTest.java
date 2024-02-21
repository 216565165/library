package Test;

import dao.UserDao;
import model.User;

public class UpdateUserTest {
    public static void main(String [] args){
        UserDao userDao = new UserDao();
        User user = new User();
        user.setId(6);
        user.setName("lqx");
        user.setPassword("456");
        user.setPhone("125666666");
        user.setEmail("12345@qq.com");
        boolean b = userDao.update(user);
        System.out.println(b);
    }
}
