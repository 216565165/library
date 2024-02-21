package Test;

import dao.TypeDao;
import dao.UserDao;

public class DeleteTypeTest {
    public static void main(String [] args){

        TypeDao typeDao = new TypeDao();
        boolean b =typeDao.delete(5);
        System.out.println(b);
    }
}
