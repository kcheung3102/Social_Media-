public class Facebook extends SocialMedia {

    public Facebook(){};

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String displayText() {
        return "you have logged into Facebook";
    }
    @Override
    public String message(){
        return "Welcome to Facebook!";
    }

}
