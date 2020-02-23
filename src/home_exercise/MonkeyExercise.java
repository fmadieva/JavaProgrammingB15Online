package home_exercise;

public class MonkeyExercise {

    public static void main(String[] args){

        /*  5 little monkeys jumping on the bed,
            One fell down and bumped his head,
            Mama called the doctor and the doctor said,
            No more monkeys jumping on the bed!
            4 little monkeys jumping on the bed,
            One fell down and bumped his head,
            Mama called the doctor and the doctor said,
            No more monkeys jumping on the bed!
            3 little monkeys jumping on the bed,
            One fell down and bumped his head,
            Mama called the doctor and the doctor said,
            No more monkeys jumping on the bed!
            2 little monkeys jumping on the bed,
            One fell down and bumped his head,
            Mama called the doctor and the doctor said,
            No more monkeys jumping on the bed!
            1 little monkey jumping on the bed,
            One fell down and bumped his head,
            Mama called the doctor and the doctor said,
            No more monkeys jumping on the bed!
            Put those monkeys right to bed!

         */

        int monkey =5;
        while(monkey>=1){
            System.out.println(monkey + " One fell down and bumped his head,\n" +
                    "Mama called the doctor and the doctor said,\n" +
                    "No more monkeys jumping on the bed!");
            --monkey;
        }
        System.out.println("Put those monkeys right to bed!");



    }
}



