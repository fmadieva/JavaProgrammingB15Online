package home_exercise;

public class MinANdMaxinArray {

    public static void main(String[] args){

        int[] scores = {100, 50, 80, 90, 5, 47};
        int minNumber = scores[0];
        int maxNumber = scores[0];

        for (int eachScore: scores) {
            if (eachScore < minNumber){
                minNumber=eachScore;
            }else if (eachScore > maxNumber){
                maxNumber=eachScore;
            }

        }

        System.out.println("Minimum number is : " + minNumber);
        System.out.println("Maximum number is : " + maxNumber);

    }
}
