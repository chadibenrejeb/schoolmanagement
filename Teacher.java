import java.util.ArrayList;

class Teacher extends User {
    private long hIndex ; 
    private ArrayList<Courses> courses ; 
public Teacher(String firstName , String lastName , String email , long cin , long hIndex , ArrayList<Courses> courses ){
    super(firstName , lastName , email , cin ); 
    this.hIndex=hIndex ; 
    this.courses = courses ;    
} 
public void displayInfo() {
    super.displayInfo();
    System.out.println("hIndex: " + hIndex);
    System.out.println("Courses taught:");
    for (Courses course : courses) {
        System.out.println(course);
    }
}

public void updateProfile(String firstName, String lastName, String email) {
    super.updateProfile(firstName, lastName, email);
} 
public void displayCoursesContent() {
    System.out.println("Courses taught and their contents:");
    for (Courses course : courses) {
        System.out.println(course.getName() + " - Contents: " + course.getContents());
    }
}
public void setHIndex(long l) {
    this.hIndex = l ;
}

}
