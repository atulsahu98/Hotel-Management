/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementApp.model;

/**
 *
 * @author Windows
 */
public class ClickOnViewBookingModel {
    String checkin_time;
    String checkout_time;
    String checkin_date;
    String checkout_date;
    int selected_id;

    public ClickOnViewBookingModel(String checkin_time, String checkout_time, String checkin_date, String checkout_date, int selected_id) {
        this.checkin_time = checkin_time;
        this.checkout_time = checkout_time;
        this.checkin_date = checkin_date;
        this.checkout_date = checkout_date;
        this.selected_id = selected_id;
    }

    public ClickOnViewBookingModel() {
    }

    
    public String getCheckin_time() {
        return checkin_time;
    }

    public void setCheckin_time(String checkin_time) {
        this.checkin_time = checkin_time;
    }

    public String getCheckout_time() {
        return checkout_time;
    }

    public void setCheckout_time(String checkout_time) {
        this.checkout_time = checkout_time;
    }

    public String getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(String checkin_date) {
        this.checkin_date = checkin_date;
    }

    public String getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }

    public int getSelected_id() {
        return selected_id;
    }

    public void setSelected_id(int selected_id) {
        this.selected_id = selected_id;
    }
   
    
}
