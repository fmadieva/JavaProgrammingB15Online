package day17;

public class WakeUp_FullNameCorrector {

    public static void main(String[] args){

        //                 0123456789
        String fullName = "ArYA sTaRk";

        String firstName = fullName.substring(0,4); //ArYA
        String lastName = fullName.substring(5); //sTaRk

        String firstNameCorrected = firstName.toUpperCase().substring(0,1)+
                                    firstName.toLowerCase().substring(1);

        System.out.println("firstNameCorrected = " + firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1)+
                                   lastName.toLowerCase().substring(1);

        System.out.println("lastNameCorrected = " + lastNameCorrected);

        fullName = firstNameCorrected + " " +lastNameCorrected;
        System.out.println(fullName);












    }
}
