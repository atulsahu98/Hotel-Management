
package hotelmanagementApp.dao;

import hotelmanagementApp.GetConnection;
import hotelmanagementApp.model.ViewBookingPanelModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewBookingPanelDAO {
   public static ArrayList<ViewBookingPanelModel> getViewPanelModelList()
    {
        Connection con = null;
        ArrayList<ViewBookingPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from newbooking";  
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
             int id=rs.getInt(1);
             String name = rs.getString(2);
             String email= rs.getString(3);
             String mobile= rs.getString(4);
             String id_name= rs.getString(5);
             String id_proof= rs.getString(6);
             String address= rs.getString(7);
             String nationality= rs.getString(8);
             int no_OfPerson=rs.getInt(9);
             int no_of_Days=rs.getInt(10);
             String aC_OR_Non_AC=rs.getString(11);
             String roomType = rs.getString(12);
             String roomNo= rs.getString(13);
             float rate= rs.getFloat(14);
             String arrival_Date= rs.getString(15);
             String booking_Date= rs.getString(16);
             String booking_Time= rs.getString(17);
             String checkin_Date= rs.getString(18);
             String checkin_Time=rs.getString(19);
             String checkout_Date=rs.getString(20);
             String checkout_Time=rs.getString(21);
             String note=rs.getString(22);
             
             ViewBookingPanelModel p = new ViewBookingPanelModel() ;
              p.setId(id);
              p.setName(name);
              p.setEmailId(email);
              p.setMobileNumber(mobile);
              p.setAddress(address);
              p.setIdName(id_name);
              p.setIdProof(id_proof);
              p.setNationality(nationality);
              
              p.setNo_of_Days(no_of_Days);
              p.setNo_of_person(no_OfPerson);
              p.setAc_non_ac(aC_OR_Non_AC);
              p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setArrival_date(arrival_Date);
              p.setBooking_date(booking_Date);
              p.setBooking_time(booking_Time);
              p.setCheckin_date(checkin_Date);
              p.setCheckin_time(checkin_Time);
              p.setCheckout_date(checkout_Date);
              p.setCheckout_time(checkout_Time);
              p.setNote(note);
              
              al.add(p);
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
     
        return al;
    }
    
    public static ArrayList<ViewBookingPanelModel> searchListByName(String searchText)
    {
        Connection con = null;
        ArrayList<ViewBookingPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from newbooking where Name=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
             int id=rs.getInt(1);
             String name = rs.getString(2);
             String email= rs.getString(3);
             String mobile= rs.getString(5);
             String id_name= rs.getString(4);
             String id_proof= rs.getString(6);
             String address= rs.getString(7);
             String nationality= rs.getString(8);
             int no_OfPerson=rs.getInt(9);
             int no_of_Days=rs.getInt(10);
             String aC_OR_Non_AC=rs.getString(11);
             String roomType = rs.getString(12);
             String roomNo= rs.getString(13);
             float rate= rs.getFloat(14);
             String arrival_Date= rs.getString(15);
             String booking_Date= rs.getString(16);
             String booking_Time= rs.getString(17);
             String checkin_Date= rs.getString(18);
             String checkin_Time=rs.getString(19);
             String checkout_Date=rs.getString(20);
             String checkout_Time=rs.getString(21);
             String note=rs.getString(22);
             
             ViewBookingPanelModel p = new ViewBookingPanelModel() ;
              p.setId(id);
              p.setName(name);
              p.setEmailId(email);
              p.setMobileNumber(mobile);
              p.setAddress(address);
              p.setIdName(id_name);
              p.setIdProof(id_proof);
              p.setNationality(nationality);
              
              p.setNo_of_Days(no_of_Days);
              p.setNo_of_person(no_OfPerson);
              p.setAc_non_ac(aC_OR_Non_AC);
              p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setArrival_date(arrival_Date);
              p.setBooking_date(booking_Date);
              p.setBooking_time(booking_Time);
              p.setCheckin_date(checkin_Date);
              p.setCheckin_time(checkin_Time);
              p.setCheckout_date(checkout_Date);
              p.setCheckout_time(checkout_Time);
              p.setNote(note);
              
              al.add(p);
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
     
        return al;
    }
    
    public static ArrayList<ViewBookingPanelModel> searchListByMobileNo(String searchText)
    {
        Connection con = null;
        ArrayList<ViewBookingPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from newbooking where Mobile=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String name = rs.getString(2);
             String email= rs.getString(3);
             String mobile= rs.getString(5);
             String id_name= rs.getString(4);
             String id_proof= rs.getString(6);
             String address= rs.getString(7);
             String nationality= rs.getString(8);
             int no_OfPerson=rs.getInt(9);
             int no_of_Days=rs.getInt(10);
             String aC_OR_Non_AC=rs.getString(11);
             String roomType = rs.getString(12);
             String roomNo= rs.getString(13);
             float rate= rs.getFloat(14);
             String arrival_Date= rs.getString(15);
             String booking_Date= rs.getString(16);
             String booking_Time= rs.getString(17);
             String checkin_Date= rs.getString(18);
             String checkin_Time=rs.getString(19);
             String checkout_Date=rs.getString(20);
             String checkout_Time=rs.getString(21);
             String note=rs.getString(22);
             
             ViewBookingPanelModel p = new ViewBookingPanelModel() ;
              p.setId(id);
              p.setName(name);
              p.setEmailId(email);
              p.setMobileNumber(mobile);
              p.setAddress(address);
              p.setIdName(id_name);
              p.setIdProof(id_proof);
              p.setNationality(nationality);
              
              p.setNo_of_Days(no_of_Days);
              p.setNo_of_person(no_OfPerson);
              p.setAc_non_ac(aC_OR_Non_AC);
              p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setArrival_date(arrival_Date);
              p.setBooking_date(booking_Date);
              p.setBooking_time(booking_Time);
              p.setCheckin_date(checkin_Date);
              p.setCheckin_time(checkin_Time);
              p.setCheckout_date(checkout_Date);
              p.setCheckout_time(checkout_Time);
              p.setNote(note);
              
              al.add(p);
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
     
        return al;
    }
    
     public static ArrayList<ViewBookingPanelModel> searchListByRoomNo(String searchText)
    {
        Connection con = null;
        ArrayList<ViewBookingPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from newbooking where RoomNo=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String name = rs.getString(2);
             String email= rs.getString(3);
             String mobile= rs.getString(5);
             String id_name= rs.getString(4);
             String id_proof= rs.getString(6);
             String address= rs.getString(7);
             String nationality= rs.getString(8);
             int no_OfPerson=rs.getInt(9);
             int no_of_Days=rs.getInt(10);
             String aC_OR_Non_AC=rs.getString(11);
             String roomType = rs.getString(12);
             String roomNo= rs.getString(13);
             float rate= rs.getFloat(14);
             String arrival_Date= rs.getString(15);
             String booking_Date= rs.getString(16);
             String booking_Time= rs.getString(17);
             String checkin_Date= rs.getString(18);
             String checkin_Time=rs.getString(19);
             String checkout_Date=rs.getString(20);
             String checkout_Time=rs.getString(21);
             String note=rs.getString(22);
             
             ViewBookingPanelModel p = new ViewBookingPanelModel() ;
              p.setId(id);
              p.setName(name);
              p.setEmailId(email);
              p.setMobileNumber(mobile);
              p.setAddress(address);
              p.setIdName(id_name);
              p.setIdProof(id_proof);
              p.setNationality(nationality);
              
              p.setNo_of_Days(no_of_Days);
              p.setNo_of_person(no_OfPerson);
              p.setAc_non_ac(aC_OR_Non_AC);
              p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setArrival_date(arrival_Date);
              p.setBooking_date(booking_Date);
              p.setBooking_time(booking_Time);
              p.setCheckin_date(checkin_Date);
              p.setCheckin_time(checkin_Time);
              p.setCheckout_date(checkout_Date);
              p.setCheckout_time(checkout_Time);
              p.setNote(note);
              
              al.add(p);
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
     
        return al;
    }
    
   public static ArrayList<ViewBookingPanelModel> searchListByBookingDate(String searchText)
    {
        Connection con = null;
        ArrayList<ViewBookingPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from newbooking where Booking_Date=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String name = rs.getString(2);
             String email= rs.getString(3);
             String mobile= rs.getString(5);
             String id_name= rs.getString(4);
             String id_proof= rs.getString(6);
             String address= rs.getString(7);
             String nationality= rs.getString(8);
             int no_OfPerson=rs.getInt(9);
             int no_of_Days=rs.getInt(10);
             String aC_OR_Non_AC=rs.getString(11);
             String roomType = rs.getString(12);
             String roomNo= rs.getString(13);
             float rate= rs.getFloat(14);
             String arrival_Date= rs.getString(15);
             String booking_Date= rs.getString(16);
             String booking_Time= rs.getString(17);
             String checkin_Date= rs.getString(18);
             String checkin_Time=rs.getString(19);
             String checkout_Date=rs.getString(20);
             String checkout_Time=rs.getString(21);
             String note=rs.getString(22);
             
             ViewBookingPanelModel p = new ViewBookingPanelModel() ;
              p.setId(id);
              p.setName(name);
              p.setEmailId(email);
              p.setMobileNumber(mobile);
              p.setAddress(address);
              p.setIdName(id_name);
              p.setIdProof(id_proof);
              p.setNationality(nationality);
              
              p.setNo_of_Days(no_of_Days);
              p.setNo_of_person(no_OfPerson);
              p.setAc_non_ac(aC_OR_Non_AC);
              p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setArrival_date(arrival_Date);
              p.setBooking_date(booking_Date);
              p.setBooking_time(booking_Time);
              p.setCheckin_date(checkin_Date);
              p.setCheckin_time(checkin_Time);
              p.setCheckout_date(checkout_Date);
              p.setCheckout_time(checkout_Time);
              p.setNote(note);
              
              al.add(p);
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
     
        return al;
    }
     
    public static ArrayList<ViewBookingPanelModel> searchListByCheckInDate(String searchText)
    {
        Connection con = null;
        ArrayList<ViewBookingPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from newbooking where Checkin_Date=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String name = rs.getString(2);
             String email= rs.getString(3);
             String mobile= rs.getString(5);
             String id_name= rs.getString(4);
             String id_proof= rs.getString(6);
             String address= rs.getString(7);
             String nationality= rs.getString(8);
             int no_OfPerson=rs.getInt(9);
             int no_of_Days=rs.getInt(10);
             String aC_OR_Non_AC=rs.getString(11);
             String roomType = rs.getString(12);
             String roomNo= rs.getString(13);
             float rate= rs.getFloat(14);
             String arrival_Date= rs.getString(15);
             String booking_Date= rs.getString(16);
             String booking_Time= rs.getString(17);
             String checkin_Date= rs.getString(18);
             String checkin_Time=rs.getString(19);
             String checkout_Date=rs.getString(20);
             String checkout_Time=rs.getString(21);
             String note=rs.getString(22);
             
             ViewBookingPanelModel p = new ViewBookingPanelModel() ;
              p.setId(id);
              p.setName(name);
              p.setEmailId(email);
              p.setMobileNumber(mobile);
              p.setAddress(address);
              p.setIdName(id_name);
              p.setIdProof(id_proof);
              p.setNationality(nationality);
              
              p.setNo_of_Days(no_of_Days);
              p.setNo_of_person(no_OfPerson);
              p.setAc_non_ac(aC_OR_Non_AC);
              p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setArrival_date(arrival_Date);
              p.setBooking_date(booking_Date);
              p.setBooking_time(booking_Time);
              p.setCheckin_date(checkin_Date);
              p.setCheckin_time(checkin_Time);
              p.setCheckout_date(checkout_Date);
              p.setCheckout_time(checkout_Time);
              p.setNote(note);
              
              al.add(p);
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
     
        return al;
    }
  
}
