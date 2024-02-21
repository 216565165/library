package Test;

import dao.BookDao;
import model.books;

public class InsertbooksTest {
    public static void main(String[] args) {
        BookDao bookDao = new BookDao();
        books book = new books();
        book.setId(6);
        book.setName("简爱");
        book.setType("2");
        boolean b = bookDao.insert(book);
        System.out.println(b);
    }
}
