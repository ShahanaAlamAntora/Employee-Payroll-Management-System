
package employee.payroll;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Antora
 */
public class db {
    
    Connection conn = null;
    public static Connection java_db(){
    
    
    try{
         
        Class.forName("org.sqlite.JDBC");
        Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Chaity\\Documents\\NetBeansProjects\\Employee Payroll\\mydatabase.sqlite");
    
        return conn;
    
    
    
    
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
    
    
     return null;
    
    }
}
}