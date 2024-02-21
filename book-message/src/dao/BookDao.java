package dao;
import model.books;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {
    public boolean insert(books book) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {

            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql = "INSERT INTO bookname(id,name,type)" + "VALUES("
                    + book.getId()
                    + ",'"
                    + book.getName()
                    + "','"
                    + book.getType()
                    +"')";
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                return true;
            }
            return false;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
        return false;
    }



    public ArrayList<books> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<books> list = new ArrayList<books>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM bookname";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                books book = new books();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setType(rs.getString("type"));
                list.add(book);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt ,conn);
        }
        return null;
    }

    //根据id查找指定的book
    public  books find(int id){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<books> list = new ArrayList<books>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM bookname WHERE id="+id;
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                books book = new books();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setType(rs.getString("type"));
                return book;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt ,conn);
        }
        return null;
    }
    //删除book
    public boolean delete(int id){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql="DELETE FROM bookname WHERE id="+id;
            int num =stmt.executeUpdate(sql);
            if (num > 0){
                return true;
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt ,conn);
        }
        return false;
    }
    //修改book
    public boolean update(books book){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql ="UPDATE bookname set name='"
                    +book.getName()
                    +"',type='"+book.getType()
                    +"' WHERE id ="+book.getId();
            int num =stmt.executeUpdate(sql);
            if(num > 0){
                return true;
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt ,conn);
        }
        return false;
    }
}
