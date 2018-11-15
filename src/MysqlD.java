/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJALA
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlD {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection link = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/basic?user=root&password=agmtagmt"/*, "root", "agmtagmt"*/);
      Statement push = link.createStatement();
      ResultSet reply = push.executeQuery("select * from users");
      
      while (reply.next()) {
      System.out.println(reply.getInt(1) + " " + reply.getString(2) + " " + reply.getString(3) + " " + reply.getString(4) + " " + reply.getString(5));
      link.close();
    }
      
    }
      catch(Exception e) {
              System.out.println(e);
              }
  }
}
