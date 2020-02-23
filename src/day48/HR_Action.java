package day48;

public class HR_Action {

    public static void main(String[] args) {

        HourlyEmployee e1 = new HourlyEmployee("Subi"  , 101, 55, 2000);
        e1.calculateAnnualSalary();

        System.out.println("e1 = "+ e1);
        HourlyEmployee e2 = new HourlyEmployee("Rukhshona", 102, 57, 2080);
        e2.calculateAnnualSalary();

        System.out.println("e2 = " + e2);

        FullTimeEmployee f1 = new FullTimeEmployee("Denis", 104, 10000);
        f1.calculateAnnualSalary();
        System.out.println("f1 = " + f1);



        // each and every class we create, it will become a data type ( reference type)


    }
}
