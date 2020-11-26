
package hotelmanagementApp.dao;

import hotelmanagementApp.GetConnection;
import hotelmanagementApp.model.AdminModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AdminDao {
    public static boolean authenticateAdmin(AdminModel admin)
    {
       Connection con=null;
       boolean status=false;
       try
       {
         con=GetConnection.getConnection();
         String sql= "select * from Admin where Username=? and Password=?";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setString(1,admin.getUsername());
         ps.setString(2,admin.getPassword());
       
       
         ResultSet rs= ps.executeQuery();
       
         if(rs.next())
         {
            status=true;
         }
       }
       catch(Exception e)
       {
          e.printStackTrace();
       }
       finally
       {
         try
         {
           con.close();
         }
         catch(Exception e)
         {
           e.printStackTrace();
         }
       }
       return status;
    }
    
}
