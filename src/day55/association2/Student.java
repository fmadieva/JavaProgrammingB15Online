package day55.association2;

public class Student {

    private String name;
    private int studentID;

    // constructor
    public Student(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }

    // getter for private string name
    public String getName(){
        return name;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                '}';
    }




}
