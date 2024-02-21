package Test;

import dao.TypeDao;
import model.Type;
public class InsertTypeTest {
        public static void main(String[] args) {
            TypeDao typeDao = new TypeDao();
            Type type = new Type();
            type.setId(5);
            type.setName("xsl");
            boolean b = typeDao.insert(type);
            System.out.println(b);
        }
    }

