package Test;

import dao.TypeDao;
import model.Type;
public class UpdateTypeTest {
    public static void main(String [] args){
        TypeDao typeDao = new TypeDao();
        Type type = new Type();
        type.setId(6);
        type.setName("lqx");
        boolean b = typeDao.update(type);
        System.out.println(b);
    }
}
