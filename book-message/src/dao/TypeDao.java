package dao;

import model.Type;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TypeDao {
    //添加用户
    public boolean insert(Type type) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {

            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql = "INSERT INTO type (id,name)" + "VALUES("
                    + type.getId()
                    + ",'"
                    + type.getName()
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

    //查询所有的Type对象
    public ArrayList<Type> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Type> list = new ArrayList<Type>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM type";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Type type = new Type();
                type.setId(rs.getInt("id"));
                type.setName(rs.getString("name"));
                list.add(type);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt ,conn);
        }
        return null;
    }

    //根据id查找指定的type
    public  Type find(int id){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Type> list = new ArrayList<Type>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM type WHERE id="+id;
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Type type = new Type();
                type.setId(rs.getInt("id"));
                type.setName(rs.getString("name"));
                return type;
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
            String sql="DELETE FROM type WHERE id="+id;
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
    public boolean update(Type type){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql ="UPDATE type set name='"+type.getName()
                    +"' WHERE id ="+type.getId();
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
