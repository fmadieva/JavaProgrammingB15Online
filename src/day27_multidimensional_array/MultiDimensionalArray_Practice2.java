package day27_multidimensional_array;

public class MultiDimensionalArray_Practice2 {


        public static void main(String[] args) {
            String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
            String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
            String[] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila", "A"};
            String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysitsTeam};
            // find the shortest string of text
            int minLength = scrumTeam[0][0].length();
            String shortestString = scrumTeam[0][0];
            for (int i = 0; i < scrumTeam.length; i++) {
                for (int j = 0; j < scrumTeam[i].length; j++) {
                    if (minLength > scrumTeam[i][j].length()) {
                        minLength = scrumTeam[i][j].length();
                        shortestString = scrumTeam[i][j];
                    }
                }
            }
            System.out.println(minLength);
            System.out.println(shortestString);
        }


    }

/*
* int[][][] arr3D = {  {{1,2,3},{4,5,6}}  ,  { {7,8,9} , {10,11,12}}   } ;
//   index of 3 d          0                         1
//    index of 2 d        0       1             0           1
//    index of 1 d      0 1 2    0 1 2        0  1  2     0  1  2
* */
