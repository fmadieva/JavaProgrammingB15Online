package practice;

public class Programmer extends EmployeeTest {
    int bonus = 10000;



    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        System.out.println("p1.bonus = " + p1.bonus);
        System.out.println("p1.salary = " + p1.salary);

    }
}
