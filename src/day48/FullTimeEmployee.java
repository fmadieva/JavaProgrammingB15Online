package day48;

// a non-abstract sub class of abstract super class
// is called concrete class
// This class is responsible providing body (implementation)
// for all abstract methods from super class.

public class FullTimeEmployee extends Employee {

    double monthlySalary;


// this is constructor, it takes 3 arguments inclucing the double monthlySalary
    public FullTimeEmployee(String name, int ID, double monthlySalary) {
        //super(name, ID);
        this.name = name;
        this.ID = ID;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary(){
        System.out.println("Fulltime Employee yearly : " + monthlySalary*12);

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                "yearly: " + monthlySalary * 12
                +  '}';
    }
}



