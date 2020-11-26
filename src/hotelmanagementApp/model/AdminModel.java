
package hotelmanagementApp.model;


public class AdminModel {
    private String username;
    private String password;
    private String catagory;

    public AdminModel(String username, String passward, String catagory) {
        this.username = username;
        this.password = password;
        this.catagory = catagory;
    }

    public AdminModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    
    
}
