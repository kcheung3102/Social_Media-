public class Twitter extends SocialMedia {

    public Twitter(){};

    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String displayText(){
        return "you have logged into Twitter" ;
    }

    @Override
    public String message(){
        return "Welcome to Twitter!";
    }




}
