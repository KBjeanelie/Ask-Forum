package cg.forum.askquestion.adapters;

public class Category {

    private String Name;

    private final String Prefix_name;

    private String Short_message;

    public Category(String name, String short_message, int ID) {
        Name = name;
        Short_message = short_message;
        this.ID = ID;
        Prefix_name = "Toute vos questions sur ";
    }

    @Override
    public String toString() {
        return Prefix_name + "le " + getName();
    }

    public String getPrefix_name() {
        return Prefix_name;
    }

    private  int ID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShort_message() {
        return Short_message;
    }

    public void setShort_message(String short_message) {
        Short_message = short_message;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
