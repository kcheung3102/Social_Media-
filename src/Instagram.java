public class Instagram extends SocialMedia {
    public Instagram(){};

    public Instagram(String userName, String password) {
        super(userName, password);
    }

    public String displayText(){
        return "you have logged into Instagram";
    }

    @Override
    public String message(){
        return "Welcome to Instagram!";
    }
}
