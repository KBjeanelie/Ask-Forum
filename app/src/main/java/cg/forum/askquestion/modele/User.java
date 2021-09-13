package cg.forum.askquestion.modele;

import java.util.ArrayList;

public class User {

    public static int nbre_users = 0;

    private int ID;

    private String FullName;

    private String Email;

    private String Password;

    private ArrayList<Image> Album;

    private Image Current_Profile_Image;

    private  boolean Session;

    public User(){}

    public User(String fullName, String email, String password, boolean session) {

        FullName = fullName;
        Email = email;
        Password = password;
        Session = session;
        Album = new ArrayList<Image>();

        nbre_users += 1;

        ID = nbre_users;

    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public ArrayList<Image> getAlbum() {
        return Album;
    }

    public void setAlbum(ArrayList<Image> album) {
        Album = album;
    }

    public Image getCurrent_Profile_Image() {
        return Current_Profile_Image;
    }

    public void setCurrent_Profile_Image(Image current_Profile_Image) {
        Current_Profile_Image = current_Profile_Image;
    }

    public boolean isSession() {
        return Session;
    }

    public void setSession(boolean session) {
        Session = session;
    }

    public int getID() {
        return ID;
    }

}
