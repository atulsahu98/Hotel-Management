
package hotelmanagementApp.model;


public class ViewRoomsPanelModel {
    private String roomNo;
    private String roomType;
    private String ac_non_ac;
    private float rate;
    private int floor;
    private int noOfBeds;
    private int selected_id;

    public ViewRoomsPanelModel() {
    }

    public ViewRoomsPanelModel(String roomNo, String roomType, String ac_non_ac, float rate, int floor, int noOfBeds, int selected_id) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.ac_non_ac = ac_non_ac;
        this.rate = rate;
        this.floor = floor;
        this.noOfBeds = noOfBeds;
        this.selected_id = selected_id;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public int getSelected_id() {
        return selected_id;
    }

    public void setSelected_id(int selected_id) {
        this.selected_id = selected_id;
    }

}
