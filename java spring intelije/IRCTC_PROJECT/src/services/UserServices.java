package services;

import Model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserServices  {


   private ArrayList<User> users=new ArrayList<>();
    Scanner s=new Scanner(System.in);



   public void definedUser(){
       users.add(new User("kaiparker", "Kaiparker284"));
       users.add(new User("bonnie", "Bonnie7886"));
       users.add(new User("tyler", "Tyler6782"));
       users.add(new User("klaus", "Klaus4245"));
       users.add(new User("damon", "Damon9821"));
       users.add(new User("stefan", "Stefen6960"));
       users.add(new User("kolmikelson", "kol81mike"));
       users.add(new User("elana", "Elana077"));
       users.add(new User("caroline", "caroline65"));
       users.add(new User("elijah", "Elijah8903"));

   }




    boolean checkUserName(String username){
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }



    public boolean registerUser(){
        System.out.println("Enter your username (Note: The username must be unique \n" +
                "\"Once a username is created, you won’t be able to change it. Choose wisely!)");
        String username=s.next();

        if(checkUserName(username)){
            System.out.println("Enter your password (Note: Password must contain at" +
                    " least one uppercase letter, one lowercase letter, and one unique character).");
            String password=s.next();
            users.add(new User(username, password));
            System.out.println("Registration successful!");
            boolean isAuthenticated= false;
            try {
                isAuthenticated = login();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return isAuthenticated;

        }else {
            System.out.println();
            System.out.println( "username : "+username +" : already taken please. Try again! ");
            registerUser();
        }
        return false;
    }




    public boolean login() throws InterruptedException {
        System.out.println("Enter your username");
        String un=s.next();
        System.out.println("Enter your password");
        String pass=s.next();
        System.out.print("Logging in " );
        for(int i=0;i<=10;i++){
            Thread.sleep(300);
            System.out.print(".");
        }
        boolean userMatch=false;
        for(User user:users){
           if(user.getUsername().equals(un) &&
                   user.getPassword().equals(pass)){
               userMatch=true;
               break;
           }
        }
        if(userMatch){
            System.out.println("logged in successfully");
            return true;

        }else{
            System.out.println("Invalid credentials! please login again ");
            login();
        }
        return false;

    }




    public void getAllUser(){       // used enhanced for loop to get all user
        for (User user : users) {
            System.out.println(user);
        }
    }



    public void deleteUser(String username){   // used Iterator class to find user
        Iterator<User> userIterator=users.iterator();
        boolean isRemoved=false;
        while(userIterator.hasNext()){
            User user=userIterator.next();
            if(user.getUsername().equals(username)){
                userIterator.remove();
                isRemoved=true;
            }
        }
        if(isRemoved){
            System.out.println("Your account has been successfully deleted! \uD83C\uDF89 Done " +
                    "and dusted, with a dash of flair!");
        }else {
            System.out.println("Oops, looks like there’s no user found with that username. \uD83D\uDE05 Let's " +
                    "double-check the spelling or try a different one.");
        }
    }



    public void changePassword(String username){
        System.out.println("Please enter your password to verify your identity.");
        String pass=s.next();
        boolean passMatch=false;
        for(User user : users){
           passMatch=users.contains(user);
        }
        if(passMatch){
            System.out.println("Password changed successfully! \uD83C\uDF89 You're all set.");
        }else {
            System.out.println("no user presenet ");
        }
    }




}
