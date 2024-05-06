class Student extends User {
    private double average;
    private Classe classe;
    private Status status;

    public Student(String firstName, String lastName, String email, long cin, double average, Classe classe, Status status) {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    } 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Average: " + average);
        System.out.println("Class: " + classe);
        System.out.println("Status: " + status);
    }

    
    public void updateProfile(String firstName, String lastName, String email) {
        super.updateProfile(firstName, lastName, email);
    }

}
