/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Danish
 */
public class DBManager {
//    public Connection getConnection(){
//    Connection connection=null;
//    System.out.println("Connection Called");   
//    try{
//            Class.forName("com.mysql.cj.jdbc.Driver");  
//            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
//    }catch(ClassNotFoundException e){
//        e.printStackTrace();
//    }catch(SQLException e){
//        e.printStackTrace();
//    }
//    
//    return connection;
//    }
      static Connection connnection = null;
        public static Connection getConnection(){
        
            try{
            
                Class.forName("com.mysql.cj.jdbc.Driver");
                connnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
                System.out.println("Connection successfull");
            }catch(Exception e){
            
                
            }
            return connnection;
        }    
    
}
