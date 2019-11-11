public class LinkedIn extends SocialMedia {
    public LinkedIn(){};

    public LinkedIn(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String displayText() {
        return "you have logged into LinkedIn";
    }

    @Override
    public String message(){
        return "Welcome to LinkedIn!";
    }

}
