package Test;
import dao.UserDao;
public class DeleteUserTest {
   public static void main(String [] args){

      UserDao ud = new UserDao();
      boolean b =ud.delete(5);
      System.out.println(b);
   }
}
