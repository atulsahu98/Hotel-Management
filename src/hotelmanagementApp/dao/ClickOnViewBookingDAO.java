/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementApp.dao;

import hotelmanagementApp.GetConnection;
import hotelmanagementApp.model.ClickOnViewBookingModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Windows
 */
public class ClickOnViewBookingDAO {
     public static Boolean checkIn(ClickOnViewBookingModel clickOnViewBookingModel)
    {
        Boolean status = false;
        Connection con = null;
       
        try 
        {
          con = GetConnection.getConnection();
         
          
          String sql = "update newbooking set checkin_time = ?,checkin_date=? where id = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,clickOnViewBookingModel.getCheckin_time());
          ps.setString(2,clickOnViewBookingModel.getCheckin_date());
          ps.setInt(3,clickOnViewBookingModel.getSelected_id());
          if(ps.executeUpdate()!=0)
          {
            status=true; 
          }
        } 
        catch (Exception e)
        {
          e.printStackTrace();
        } 
        finally 
        {
            try
            {
                con.close();
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
      return status;
    }
   
   public static Boolean checkOut(ClickOnViewBookingModel clickOnViewBookingModel)
    {
        Boolean status = false;
        Connection con = null;
       
        try 
        {
          con = GetConnection.getConnection();
         
          
          String sql = "update newbooking set checkout_time = ?,checkout_date=? where id = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,clickOnViewBookingModel.getCheckout_time());
          ps.setString(2,clickOnViewBookingModel.getCheckout_date());
          ps.setInt(3,clickOnViewBookingModel.getSelected_id());
          if(ps.executeUpdate()!=0)
          {
            status=true; 
          }
        } 
        catch (Exception e)
        {
          e.printStackTrace();
        } 
        finally 
        {
            try
            {
                con.close();
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
      return status;
    }
   
    public static Boolean verifyCheckIn(ClickOnViewBookingModel clickOnViewBookingModel)
    {
        Boolean status=false;
        Connection con=null;
        try
        {
         String checkinTime=null;
         con=GetConnection.getConnection();   
         String sql="select * From newbooking where id = ?";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setInt(1,clickOnViewBookingModel.getSelected_id());
         ResultSet rs = ps.executeQuery();
         while(rs.next())
         {
           checkinTime = rs.getString(18);
         }
         if(checkinTime != null)
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
    
    public static Boolean verifyCheckOut(ClickOnViewBookingModel clickOnViewBookingModel)
    {
        Boolean status=false;
        Connection con=null;
        try
        {
         String checkoutTime=null;
         con=GetConnection.getConnection();   
         String sql="select * From newbooking where id = ?";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setInt(1,clickOnViewBookingModel.getSelected_id());
         ResultSet rs = ps.executeQuery();
         while(rs.next())
         {
           checkoutTime = rs.getString(20);
         }
         if(checkoutTime != null)
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
