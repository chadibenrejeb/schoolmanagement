import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Student student = new Student("student1", "student1", "student@email.com", 12345L, 15.0, Classe.IA1_2, Status.NON_REDOUBLANT);
        student.displayInfo();
        student.updateProfile("student11", "student11", "john.doe.new@email.com");
        student.displayInfo();
        boolean isAuthenticatedStudent = student.authenticate("john.doe@email.com");
        System.out.println("Student Authentication: " + isAuthenticatedStudent);

        ArrayList<String> mathCourseContents = new ArrayList<>();
        mathCourseContents.add("Algebra") ;
        mathCourseContents.add("Calculus");
        ArrayList<String> physicsCourseContents = new ArrayList<>();
        physicsCourseContents.add("Mechanics");
        physicsCourseContents.add("Thermodynamics");
        Courses mathCourse = new Courses("Math", 2.0f);
        Courses physicsCourse = new Courses("Physics", 1.5f);

        ArrayList<Courses> courses = new ArrayList<>();
        courses.add(mathCourse);
        courses.add(physicsCourse);
        Teacher teacher = new Teacher("teacher1", "teacher1", "teacher1@email.com", 67890L, 12L , courses);
        teacher.setHIndex(10L);
        teacher.displayInfo();
        teacher.displayCoursesContent();

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Task1");
        tasks.add("Task2"); 
        tasks.add("Task3");
        staffMember staffMember = new staffMember("member1", "member1", "member1@email.com", 11111L, "Engineer" , 5 , tasks);
        staffMember.displayInfo();
        staffMember.finishTask("Task2");
        staffMember.displayInfo();
    }
}

