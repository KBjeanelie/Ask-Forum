package cg.forum.askquestion.authentification;

import cg.forum.askquestion.modele.CurrentUser;
import cg.forum.askquestion.modele.User;
import cg.forum.askquestion.modele.UsersManager;

public interface Authentification {

    public static boolean login(String email, String password)
    {
        boolean i = false;

        for(User user : UsersManager.USERS) {

            if(user.getEmail().equals(email) &&  user.getPassword().equals(password))
            {
                user.setSession(true);
                CurrentUser.user.setEmail(user.getEmail());
                CurrentUser.user.setFullName(user.getFullName());
                CurrentUser.user.setPassword(user.getPassword());
                CurrentUser.user.setAlbum(user.getAlbum());
                CurrentUser.user.setSession(user.isSession());
                CurrentUser.user.setCurrent_Profile_Image(user.getCurrent_Profile_Image());
                i =  true;
                break;

            }else {
                i =   false;
            }
        }

        return  i;
    }

    public static boolean logout()
    {
        if (CurrentUser.emptyUserInfo())
            return true;
        else
            return  false;
    }
}
