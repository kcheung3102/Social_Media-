import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SocialMediaApp {
    private static ArrayList<SocialMedia> socialMediaDB = new ArrayList<>();

    public static void main(String[] args) {
	    boolean logIn = true;
	    boolean toContinue = true;
	    Scanner input = new Scanner(System.in);
        SocialMedia newUser = new SocialMedia("john123", "password");
        socialMediaDB.add(newUser);

    do {
        System.out.println("Do you want to use Facebook,Twitter, Instagram, or LinkedIn?");
        String media = input.nextLine();

        if (media.equalsIgnoreCase("facebook")) {
            Facebook facebook = new Facebook();
            System.out.println(facebook.message());
            ArrayList<Facebook> facebookUsers = getfbUserLogin();
            if(facebookUsers != null) {
                do {
                    for (Facebook f : facebookUsers) {
                        System.out.println(f.displayText());
                    }
                    System.out.println("Do you want to log out?(Y/N)");
                    String str = input.nextLine().trim();
                    if (str.equalsIgnoreCase("y")) {
                        logIn = false;
                    }

                } while (logIn);

                System.out.println("You have logged out");
            }
        } else if (media.equalsIgnoreCase("twitter")) {
            Twitter twitter = new Twitter();
            System.out.println(twitter.message());
            ArrayList<Twitter> twitterUsers = getTwitUserLogin();
            if(twitterUsers != null) {
                do {
                    for (Twitter t : twitterUsers) {
                        System.out.println(t.displayText());
                    }
                    System.out.println("Do you want to log out?(Y/N)");
                    String str = input.nextLine().trim();
                    if (str.equalsIgnoreCase("y")) {
                        logIn = false;
                    }
                } while (logIn);
                System.out.println("You have logged out");
            }
        } else if (media.equalsIgnoreCase("linkedin")) {
            LinkedIn linkedin = new LinkedIn();
            System.out.println(linkedin.message());
            ArrayList<LinkedIn> linkedIn = getLinkUserLogin();
            if (linkedIn != null) {
                do {
                    for (LinkedIn l : linkedIn) {
                        System.out.println(l.displayText());
                    }
                    System.out.println("Do you want to log out?(Y/N)");
                    String str = input.nextLine().trim();
                    if (str.equalsIgnoreCase("y")) {
                        logIn = false;
                    }

                } while (logIn);
            }
            System.out.println("You have logged out");
        }
        else if (media.equalsIgnoreCase("instagram")) {
            Instagram insta = new Instagram();
            System.out.println(insta.message());

            ArrayList<Instagram> instagram = getInstaLogin();
            if (instagram != null) {
                do {
                    for (Instagram l : instagram) {
                        System.out.println(l.displayText());
                    }
                    System.out.println("Do you want to log out?(Y/N)");
                    String str = input.nextLine().trim();
                    if (str.equalsIgnoreCase("y")) {
                        logIn = false;
                    }
                } while (logIn);
                System.out.println("you have logged out");
            }
        } else {
            System.out.println("not valid media selection");
        }

        System.out.println("Do you want to selection another application?(Y/N)");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("n")) {
            toContinue = false;
        }

    }while(toContinue);
        System.out.println("Goodbye");
    }

    private static ArrayList<Facebook> getfbUserLogin(){
        ArrayList<Facebook> fbUser = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.println("Enter Username: ");
        userName = input.nextLine();
        System.out.println("Enter password: ");
        password = input.nextLine();

        boolean validation = toValid(userName, password);
        if(validation) {
            //store the input data into arraylist
            fbUser.add(new Facebook(userName, password));
            return fbUser;
        } else {
            System.out.println("Invalid");
            return null;
        }
    }

    private static ArrayList<Twitter> getTwitUserLogin(){
        ArrayList<Twitter> twitUser = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.println("Enter Username: ");
        userName = input.nextLine();
        System.out.println("Enter password: ");
        password = input.nextLine();
        boolean validation = toValid(userName, password);
        if(validation) {
            //store the input data into arraylist
            twitUser.add(new Twitter(userName, password));
            return twitUser;
        } else {
            System.out.println("Invalid");
            return null;
        }
    }

    private static ArrayList<LinkedIn> getLinkUserLogin(){
        ArrayList<LinkedIn> linkedInUser = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.println("Enter Username: ");
        userName = input.nextLine();
        System.out.println("Enter password: ");
        password = input.nextLine();
        boolean validation = toValid(userName, password);
        //store the input data into arraylist
        if(validation) {
            linkedInUser.add(new LinkedIn(userName, password));
            return linkedInUser;
        } else {
            System.out.println("Invalid");
            return null;
        }
    }

    private static ArrayList<Instagram> getInstaLogin(){
        ArrayList<Instagram> instaUser = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.println("Enter Username: ");
        userName = input.nextLine();
        System.out.println("Enter password: ");
        password = input.nextLine();

        boolean validation = toValid(userName, password);
        if(validation) {
            //store the input data into arraylist
            instaUser.add(new Instagram(userName, password));
            return instaUser;
        } else {
            System.out.println("Invalid");
            return null;
        }

    }

    public static boolean toValid(String userName, String password){
        for(SocialMedia sm: socialMediaDB ) {
            if(userName.equalsIgnoreCase(sm.getUserName()) && password.equalsIgnoreCase(sm.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
