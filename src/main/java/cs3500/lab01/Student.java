package cs3500.lab01;

public class Student {

    private final String fullName;
    private final double gpa;

    public Student(String n, double gpa){
        this.fullName = n;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String retVal = fullName;
        return retVal;
    }


}
