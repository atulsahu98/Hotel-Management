/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementApp.dao;

import hotelmanagementApp.GetConnection;
import hotelmanagementApp.model.NewBookingModel;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Windows
 */
public class NewBookingDAO {
    public static boolean registerNewCustomer(NewBookingModel p)
   {
    Connection con = null;
    boolean status = false;
     try
     {
      con = GetConnection.getConnection();
      String sql = "insert into newbooking(Name,Email,Mobile,Id_name,Id_proof,Address,Nationality,RoomNo,AC_OR_Non_AC,RoomType,No_OfPerson,No_of_Days,Rate,Booking_Date,Booking_Time,Note,Arrival_Date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement ps = con.prepareStatement(sql);
       
      ps.setString(1,p.getName());
      ps.setString(2,p.getEmailId());
      ps.setString(3,p.getMobileNumber());
      ps.setString(4,p.getIdName());
      ps.setString(5,p.getIdProof());
      ps.setString(6,p.getAddress());
      ps.setString(7,p.getNationality());
      ps.setString(8,p.getRoomNo());
      ps.setString(9,p.getAc_non_ac());
      ps.setString(10,p.getRoomType());
      ps.setInt(11,p.getNo_of_person());
      ps.setInt(12,p.getNo_of_Days());
      ps.setFloat(13,p.getRate());
      ps.setString(14,p.getBooking_date());
      ps.setString(15,p.getBooking_time());
      ps.setString(16,p.getNote());
       ps.setString(17,p.getArrival_date());
        if(ps.executeUpdate() != 0)
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
