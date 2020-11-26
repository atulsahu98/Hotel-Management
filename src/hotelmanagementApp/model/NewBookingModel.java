/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementApp.model;


public class NewBookingModel {
    private int id;   
    private String  name;
    private String  emailId;
    private String  mobileNumber;
    private String  nationality;
    private String  address;
    private int  no_of_person;
    private int no_of_Days;
    private String  roomNo;
    private String  roomType;
    private String  ac_non_ac;
    private float  rate;
    private String  idProof;
    private String  idName;
    private String  arrival_date;
    private String  booking_date;
    private String  booking_time;
    private String  checkin_date;
    private String  checkin_time;
    private String  checkout_date;
    private String  checkout_time;
     private String note; 

    public NewBookingModel() {
    }

    public NewBookingModel(int id, String name, String emailId, String mobileNumber, String nationality, String address, int no_of_person, int no_of_Days, String roomNo, String roomType, String ac_non_ac, float rate, String idProof, String idName, String arrival_date, String booking_date, String booking_time, String checkin_date, String checkin_time, String checkout_date, String checkout_time, String note) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.nationality = nationality;
        this.address = address;
        this.no_of_person = no_of_person;
        this.no_of_Days = no_of_Days;
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.ac_non_ac = ac_non_ac;
        this.rate = rate;
        this.idProof = idProof;
        this.idName = idName;
        this.arrival_date = arrival_date;
        this.booking_date = booking_date;
        this.booking_time = booking_time;
        this.checkin_date = checkin_date;
        this.checkin_time = checkin_time;
        this.checkout_date = checkout_date;
        this.checkout_time = checkout_time;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNo_of_person() {
        return no_of_person;
    }

    public void setNo_of_person(int no_of_person) {
        this.no_of_person = no_of_person;
    }

    public int getNo_of_Days() {
        return no_of_Days;
    }

    public void setNo_of_Days(int no_of_Days) {
        this.no_of_Days = no_of_Days;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getAc_non_ac() {
        return ac_non_ac;
    }

    public void setAc_non_ac(String ac_non_ac) {
        this.ac_non_ac = ac_non_ac;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }

    public String getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(String checkin_date) {
        this.checkin_date = checkin_date;
    }

    public String getCheckin_time() {
        return checkin_time;
    }

    public void setCheckin_time(String checkin_time) {
        this.checkin_time = checkin_time;
    }

    public String getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }

    public String getCheckout_time() {
        return checkout_time;
    }

    public void setCheckout_time(String checkout_time) {
        this.checkout_time = checkout_time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

   
}
