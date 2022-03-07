package Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    String name = "^[A-Z][a-z]{3}+$";
    String lastN = "^[A-Z][a-z]{3}+$";
    String mobileN = "^[0-9]{10}$";
    String passW = "[A-Z][a-z]{2}[0-9]{2}[@]+$";
    String emailR = "^[a-z][a-z]{3}[0-9]{3}[@][a-z]{5}[.][a-z]{3}+$";

    public boolean firstName(String input) {
       // System.out.println("Enter User Name");
       // Scanner sc = new Scanner(System.in);
       // String input = sc.next();
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(input);

       /* if (pattern.matches(name, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");*/
        return matcher.find();
    }

    public boolean lastName(String input) {
       // System.out.println("Enter User Last Name");
       // Scanner sc = new Scanner(System.in);
        //String input = sc.next();
        Pattern pattern = Pattern.compile(lastN);
        Matcher matcher = pattern.matcher(input);

       /* if (pattern.matches(lastN, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");*/
        return matcher.find();
    }

    public boolean mobile_number(String input) {
        /*System.out.println("Enter User Mobile_Number");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();*/
        Pattern pattern = Pattern.compile(mobileN);
        Matcher matcher = pattern.matcher(input);

       /* if (pattern.matches(mobileN, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");*/
        return matcher.find();
    }

    public boolean password(String input) {
       /* System.out.println("Enter User Pass_Word");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();*/
        Pattern pattern = Pattern.compile(passW);
        Matcher matcher = pattern.matcher(input);

     /*   if (pattern.matches(passW, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");*/
        return matcher.find();
    }

    public boolean email(String input) {
       /* System.out.println("Enter User Email");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();*/
        Pattern pattern = Pattern.compile(emailR);
        Matcher matcher = pattern.matcher(input);

       /* if (pattern.matches(emailR, input)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");*/
        return matcher.find();
    }
}
