package cg.forum.askquestion.modele;

public interface CurrentUser {

    public User user = new User();

    public static boolean emptyUserInfo()
    {
        user.setEmail(null);
        user.setFullName(null);
        user.setPassword(null);
        user.setAlbum(null);
        user.setSession(false);
        user.setCurrent_Profile_Image(null);

        if (!user.isSession()){
            return true;
        }else {
            return false;
        }
    }
}
