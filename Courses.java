import java.util.ArrayList;

class Courses {
    private String name ; 
    private ArrayList<String> contents ; 
    private Float coef ; 
    public Courses(String name , Float coef) {
        this.name = name;
        this.contents = new ArrayList<String>();
        this.coef = coef;
    }
    public String toString() {
        return name + " - Coef: " + coef;
    }
    public String getName() {
        return name ;
    }
    public ArrayList<String> getContents() {
        return contents ;
    }



}
