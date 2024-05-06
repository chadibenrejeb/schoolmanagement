
 class User {   
    private String firstName ; 
    private String lastName ; 
    private String email ; 
    private long cin ; 
    public User(String firstName , String lastName , String email , long cin){
        this.firstName=firstName ; 
        this.lastName=lastName ; 
        this.email=email ; 
        this.cin=cin ;
    } 
    public void displayInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("CIN: " + cin);
    }

    public void updateProfile(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public boolean authenticate(String email) {
        System.out.println("-----------");
        return this.email.equals(email);
    }

    
    
}
