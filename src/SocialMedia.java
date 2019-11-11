public class SocialMedia {
   protected String userName;
   protected String password;

    public SocialMedia() {
    }

    public SocialMedia(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String message(){
        return "Welcome to...";
    }
}
