import java.util.ArrayList;

class staffMember extends User {
    private String qualification ; 
    private int experience ; 
    private ArrayList<String> tasks ; 

    public staffMember (String firstName , String lastName , String email , long cin , String qualification , int exp , ArrayList<String> tasks){
        super(firstName , lastName , email , cin);
        this.qualification=qualification ; 
        this.experience=exp ;
        this.tasks = tasks ;
    } 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Tasks: " + tasks);
    }

    public void updateProfile(String firstName, String lastName, String email) {
        super.updateProfile(firstName, lastName, email);
    }
    public void finishTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task '" + task + "' finished.");
        } else {
            System.out.println("Task '" + task + "' not found.");
        }
    }



}
