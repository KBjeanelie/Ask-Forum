package cg.forum.askquestion.adapters;

public class Question {

    private  String Category;

    private String Title;

    private String Image_url;

    private String Details;


    public Question(String category, String title, String details) {
        Category = category;
        Title = title;
        Details = details;
    }


    public Question(String category, String title, String image_url, String details) {
        Category = category;
        Title = title;
        Image_url = image_url;
        Details = details;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }

}
