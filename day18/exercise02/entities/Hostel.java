package entities;

public class Hostel {
    private String student;
    private String email;
    private int bedroom;

    public Hostel(String student, String email, int bedroom) {
        this.student = student;
        this.email = email;
        this.bedroom = bedroom;
    }
    
    public String getStudent() {
        return this.student;
    }

    public String getEmail() {
        return this.email;
    }

    public int getBedroom() {
        return this.bedroom;
    }

    public String toString() {
        return this.student + ", " + this.email;
    }
}
