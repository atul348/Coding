
package govtschemeportal;
import java.sql.*;

public class Dbconnect {
      
    Connection con =null;
    
    public Dbconnect() throws Exception
    {
        //System.out.println("Hello i am jbunkpjhvgf");
        Class.forName("oracle.jdbc.OracleDriver");
        
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
       
    
    }
    
    public void queryExecuter(String sql) throws Exception
    {
        Statement stat= con.createStatement();
        stat.execute(sql);
        stat.close();
        con.close();
    }
    
    public ResultSet queryReturner(String sql) throws Exception
    {
        Statement stat=con.createStatement();
        ResultSet rs=stat.executeQuery(sql);
        return rs;
        
    }
    
  
}
