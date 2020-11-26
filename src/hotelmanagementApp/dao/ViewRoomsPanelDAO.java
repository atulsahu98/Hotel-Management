/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementApp.dao;

import hotelmanagementApp.GetConnection;
import hotelmanagementApp.model.ViewRoomsPanelModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class ViewRoomsPanelDAO {
    public static ArrayList<ViewRoomsPanelModel> getViewPanelModelList()
    {
        Connection con = null;
        ArrayList<ViewRoomsPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from add_rooms";  
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
             int id=rs.getInt(1);
             String roomNo = rs.getString(2);
             String roomType= rs.getString(3);
             int floor= rs.getInt(4);
             int noOfBeds= rs.getInt(5);
             String ac_non_ac= rs.getString(6);
             float rate= rs.getFloat(7);
            
             ViewRoomsPanelModel p = new ViewRoomsPanelModel() ;
              p.setSelected_id(id);
               p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setFloor(floor);
              p.setNoOfBeds(noOfBeds);
              p.setAc_non_ac(ac_non_ac);
             
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
   
     public static ArrayList<ViewRoomsPanelModel> searchListByRoomNo(String searchText)
    {
        Connection con = null;
        ArrayList<ViewRoomsPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from add_rooms where Room_Number=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String roomNo = rs.getString(2);
             String roomType= rs.getString(3);
             int floor= rs.getInt(4);
             int noOfBeds= rs.getInt(5);
             String ac_non_ac= rs.getString(6);
             float rate= rs.getFloat(7);
            
             ViewRoomsPanelModel p = new ViewRoomsPanelModel() ;
              p.setSelected_id(id);
               p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setFloor(floor);
              p.setNoOfBeds(noOfBeds);
              p.setAc_non_ac(ac_non_ac);
             
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
    
    public static ArrayList<ViewRoomsPanelModel> searchListByRoomType(String searchText)
    {
        Connection con = null;
        ArrayList<ViewRoomsPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from add_rooms where Room_Type=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String roomNo = rs.getString(2);
             String roomType= rs.getString(3);
             int floor= rs.getInt(4);
             int noOfBeds= rs.getInt(5);
             String ac_non_ac= rs.getString(6);
             float rate= rs.getFloat(7);
            
             ViewRoomsPanelModel p = new ViewRoomsPanelModel() ;
              p.setSelected_id(id);
               p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setFloor(floor);
              p.setNoOfBeds(noOfBeds);
              p.setAc_non_ac(ac_non_ac);
             
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
    
     public static ArrayList<ViewRoomsPanelModel> searchListByFloorNo(String searchText)
    {
        Connection con = null;
        ArrayList<ViewRoomsPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from add_rooms where Floor=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String roomNo = rs.getString(2);
             String roomType= rs.getString(3);
             int floor= rs.getInt(4);
             int noOfBeds= rs.getInt(5);
             String ac_non_ac= rs.getString(6);
             float rate= rs.getFloat(7);
            
             ViewRoomsPanelModel p = new ViewRoomsPanelModel() ;
              p.setSelected_id(id);
               p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setFloor(floor);
              p.setNoOfBeds(noOfBeds);
              p.setAc_non_ac(ac_non_ac);
             
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
    
      public static ArrayList<ViewRoomsPanelModel> searchListByAC_nonAC(String searchText)
    {
        Connection con = null;
        ArrayList<ViewRoomsPanelModel>al =new ArrayList<>();
        try 
        {
           con = GetConnection.getConnection();
           String sql ="select * from add_rooms where AC_or_NonAC=?";  
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,searchText);
           ResultSet rs = ps.executeQuery();
             while(rs.next())
           {
             int id=rs.getInt(1);
             String roomNo = rs.getString(2);
             String roomType= rs.getString(3);
             int floor= rs.getInt(4);
             int noOfBeds= rs.getInt(5);
             String ac_non_ac= rs.getString(6);
             float rate= rs.getFloat(7);
            
             ViewRoomsPanelModel p = new ViewRoomsPanelModel() ;
              p.setSelected_id(id);
              p.setRoomType(roomType);
              p.setRoomNo(roomNo);
              p.setRate(rate);
              p.setFloor(floor);
              p.setNoOfBeds(noOfBeds);
              p.setAc_non_ac(ac_non_ac);
             
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
