package Test;

import dao.BookDao;
import model.books;

public class UpdatebooksTest {
    public static void main(String [] args){
        BookDao bookDao = new BookDao();
        books book = new books();
        book.setId(2);
        book.setName("lqx");
        book.setType("1");
        boolean b = bookDao.update(book);
        System.out.println(b);
    }
}
