/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementApp.dao;

import hotelmanagementApp.GetConnection;
import hotelmanagementApp.model.EditBookingModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Windows
 */
public class EditBookingDAO {

    public static void fecthDataInModel(EditBookingModel editBookingModel) {
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "select * from newbooking where id =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, editBookingModel.getSelected_id());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //int id=rs.getInt(1);
                editBookingModel.setName(rs.getString(2));
                editBookingModel.setEmailId(rs.getString(3));
                editBookingModel.setMobileNumber(rs.getString(4));
                editBookingModel.setIdName(rs.getString(5));
                editBookingModel.setIdProof(rs.getString(6));
                editBookingModel.setAddress(rs.getString(7));
                editBookingModel.setNationality(rs.getString(8));
                editBookingModel.setNo_of_person(rs.getInt(9));
                editBookingModel.setNo_of_Days(rs.getInt(10));
                editBookingModel.setAc_non_ac(rs.getString(11));
                editBookingModel.setRoomType(rs.getString(12));
                editBookingModel.setRoomNo(rs.getString(13));
                editBookingModel.setRate(rs.getFloat(14));
                editBookingModel.setArrival_date(rs.getString(15));
                editBookingModel.setBooking_date(rs.getString(16));
                editBookingModel.setBooking_time(rs.getString(17));
                editBookingModel.setCheckin_date(rs.getString(18));
                editBookingModel.setCheckin_time(rs.getString(19));
                editBookingModel.setCheckout_date(rs.getString(20));
                editBookingModel.setCheckout_time(rs.getString(21));
                editBookingModel.setNote(rs.getString(22));
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

    public static Boolean updateCustomerData(EditBookingModel editBookingModel) {
        boolean status = false;
        Connection con = null;

        try {
            con = GetConnection.getConnection();

            String sql = "update newbooking set Name=?,Email=?,Mobile=?,Id_name=?,Id_proof=?,Address=?,Nationality=?,RoomNo=?,AC_OR_Non_AC=?,RoomType=?,No_OfPerson=?,No_of_Days=?,Rate=?,Note=?,Arrival_Date=? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, editBookingModel.getName());
            ps.setString(2, editBookingModel.getEmailId());
            ps.setString(3, editBookingModel.getMobileNumber());
            ps.setString(4, editBookingModel.getIdName());
            ps.setString(5, editBookingModel.getIdProof());
            ps.setString(6, editBookingModel.getAddress());
            ps.setString(7, editBookingModel.getNationality());
            ps.setString(8, editBookingModel.getRoomNo());
            ps.setString(9, editBookingModel.getAc_non_ac());
            ps.setString(10, editBookingModel.getRoomType());
            ps.setInt(11, editBookingModel.getNo_of_person());
            ps.setInt(12, editBookingModel.getNo_of_Days());
            ps.setFloat(13, editBookingModel.getRate());
            ps.setString(14, editBookingModel.getNote());
            ps.setString(15, editBookingModel.getArrival_date());
            ps.setInt(16, editBookingModel.getSelected_id());
           

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
}
