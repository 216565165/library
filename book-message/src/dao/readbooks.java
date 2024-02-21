package dao;

import java.sql.*;

public class readbooks {
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            //注册数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/books";
            String username = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql="select * from bookname";
            rs = stmt.executeQuery(sql);
            System.out.println("id | name | type");
            while (rs.next()){
                int id=rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                System.out.println(id + "|" + name +  "|" + type);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (rs!=null){
                try{
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs=null;

            }
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}