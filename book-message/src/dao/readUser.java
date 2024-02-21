package dao;

import java.sql.*;

public class readUser {
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
            String sql="select * from user";
            rs = stmt.executeQuery(sql);
            System.out.println("id | bookName | password  phone |  email");
            while (rs.next()){
                int id=rs.getInt("id");
                String Name = rs.getString("Name");
                String Password = rs.getString("Password");
                String phone = rs.getString("phone");
                 String email = rs.getString("email");
                System.out.println(id+"|" +Name+"|"+Password+"|"+phone+"|"+email);
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

            }
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
