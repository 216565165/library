package Test;

import dao.UserDao;
import model.User;

import java.util.ArrayList;

public class FindAllUserTest {
    public static void main(String [] args){
        UserDao userDao = new UserDao();
        ArrayList<User> list = userDao.findAll();
        for (int i = 0 ;i<list.size();i++){
            System.out.println("第" + (i+1) + "条的数据的name值为："
            + list.get(i).getName());
        }
    }

}
