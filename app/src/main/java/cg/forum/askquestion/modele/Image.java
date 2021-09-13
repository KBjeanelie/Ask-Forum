package cg.forum.askquestion.modele;

public class Image {

    private long  iD;

    private String Image_URL;


    public Image(long iD, String image_URL) {
        this.iD = iD;
        Image_URL = image_URL;
    }

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    public String getImage_URL() {
        return Image_URL;
    }

    public void setImage_URL(String image_URL) {
        Image_URL = image_URL;
    }

}
