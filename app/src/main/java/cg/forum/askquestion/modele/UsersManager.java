package cg.forum.askquestion.modele;

import java.util.ArrayList;

public interface UsersManager {

    public static ArrayList<User> USERS = new ArrayList<User>();

    public static boolean addUser(User u)
    {
        USERS.add(u);
        return true;
    }

    public static User getSingleUser(int position)
    {
        return USERS.get(position);
    }

    public static boolean initialiazeDefaultUsers(){

        USERS.add(new User("KUBEMBULA Jean Elie", "jeaneliekubembula@gmail.com", "password", false));

        USERS.add(new User("Kali Linux", "kali@gmail.com", "root", false));

        return true;

    }


}
