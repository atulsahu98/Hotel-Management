
package hotelmanagementApp.dao;

import hotelmanagementApp.GetConnection;
import hotelmanagementApp.model.AddRoomsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AddRoomsDAO {
     public static boolean addNewRoom(AddRoomsModel p)
   {
    Connection con = null;
    boolean status = false;
     try
     {
      con = GetConnection.getConnection();
      String sql = "insert into add_rooms(Room_Number,Room_Type,Floor,No_Of_Beds,AC_or_NonAC,Rate) values(?,?,?,?,?,?)";
      PreparedStatement ps = con.prepareStatement(sql);
       
      ps.setString(1,p.getRoomNo());
      ps.setString(2,p.getRoomType());
      ps.setInt(3,p.getFloor());
      ps.setInt(4,p.getNoOfBeds());
      ps.setString(5,p.getAc_non_ac());
      ps.setFloat(6,p.getRate());
     
        if(ps.executeUpdate()!= 0)
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
   
     public static Boolean updateRoom(AddRoomsModel addRoomsModel) {
        boolean status = false;
        Connection con = null;

        try {
            con = GetConnection.getConnection();

            String sql = "update add_rooms set Room_Number=?,Room_Type=?,Floor=?,No_Of_Beds=?,AC_or_NonAC=?,Rate=? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, addRoomsModel.getRoomNo());
            ps.setString(2, addRoomsModel.getRoomType());
            ps.setInt(3, addRoomsModel.getFloor());
            ps.setInt(4, addRoomsModel.getNoOfBeds());
            ps.setString(5, addRoomsModel.getAc_non_ac());
            ps.setFloat(6, addRoomsModel.getRate());
            ps.setInt(7, addRoomsModel.getSelected_id());
        
            if (ps.executeUpdate() != 0) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return status;
    }
    
     public static void fecthDataInModel(AddRoomsModel addRoomsModel) {
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "select * from add_rooms where id =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, addRoomsModel.getSelected_id());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //int id=rs.getInt(1);
                addRoomsModel.setRoomNo(rs.getString(2));
                addRoomsModel.setRoomType(rs.getString(3));
                addRoomsModel.setFloor(rs.getInt(4));
                addRoomsModel.setNoOfBeds(rs.getInt(5));
                addRoomsModel.setAc_non_ac(rs.getString(6));
                addRoomsModel.setRate(rs.getInt(7));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
