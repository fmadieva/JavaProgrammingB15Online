package day48;

public abstract class Employee {

    String name;
    int ID;

    public Employee(){

    }
//Why do we have constructor here?
    // We CANNOT CREATE AN OBJECT OUT OF IT
    // WHAT is the point?
    // so that sub class can reuse the code of setting id and name
    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void calculateAnnualSalary();
    // THis is optional: the only reason we put it here is to provide toString method

    public abstract String toString();
}




   /* Warm up
----------
abstract super class called Employee
        instance fields : name , id
        Constructor : to set all the fields
abstract methods :
        calculateAnualSalary
        toString

        HourlyEmployee
        instance fields :
        hourlyWage , numsOfHours ,
        Constructor : to set all the fields
        instance methods ;
        calculateAnualSalary
        toString
        ----------------
        FullTimeEmployee
        instance fields :
        monthlySalary
        Constructor : to set all the fields
        instance methods ;
        calculateAnualSalary
        toString */