package Test;

import dao.BookDao;


public class DeletebooksTest {
    public static void main(String [] args){

        BookDao bookDao = new BookDao();
        boolean b =bookDao.delete(6);
        System.out.println(b);
    }
}
