package office_hour.Practice_01_13_2020;

public class AtTheBank2OfficeHour {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.balance = 5000;
        ba1.deposit(10000);

//       not good -  ba1.balance = ba1.balance + 10000;


    }
}
