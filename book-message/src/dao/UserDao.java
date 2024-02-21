package dao;

import model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao {
    //添加用户
    public boolean insert(User user) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {

            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql = "INSERT INTO user(id,name,password,phone,email)" + "VALUES("
                    + user.getId()
                    + ",'"
                    + user.getName()
                    + "','"
                    + user.getPassword()
                    + "'"
                    + user.getPhone()
                    +"','"
                    + user.getEmail()
                    +"')'";
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

    //查询所有的User对象
    public ArrayList<User> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<User> list = new ArrayList<User>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM user";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt ,conn);
        }
        return null;
    }

    //根据id查找指定的user
    public  User find(int id){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<User> list = new ArrayList<User>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM user WHERE id="+id;
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                return user;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt ,conn);
        }
        return null;
    }
    //删除用户
    public boolean delete(int id){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql="DELETE FROM user WHERE id="+id;
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
    //修改用户
    public boolean update(User user){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql ="UPDATE user set name='"+user.getName()
                    +"',password='"+user.getPassword()
                    +"',phone='"+user.getPhone()
                    +"',email='"+user.getEmail()
                    +"' WHERE id ="+user.getId();
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


}//最后的那个分号




