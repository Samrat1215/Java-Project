
import java.sql.Connection;
import java.sql.DriverManager; 
import javax.swing.JOptionPane;
public class MyConnection{


  public static Connection getConnection(){
      Connection con =null; 
      try {
          Class.forName("com.mysql.jdbc.Driver");
          
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
          
      } catch ( Exception ex) {
          JOptionPane.showMessageDialog(null,ex);
      }
      
      return con;
  }  
}
