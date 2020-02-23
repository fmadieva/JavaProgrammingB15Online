package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("/Users/fmadieva/IdeaProjects/JavaProgrammingB15Online/src/day63/employeeData.txt"));

        Map<Integer, String> idNamePair = new HashMap<>();

        for(String eachLine : allData) {
            int id = Integer.parseInt(eachLine.split(",") [0]); // cutting the String into 2 parts: first part into number
            // saving second part into name
            String name = eachLine.split(",")[1];

//            System.out.println("id is = " + id );
//            System.out.println("name is = " + name );
            idNamePair.put(id,name); // adding the data into the map

        }

        System.out.println("idNamePair = " + idNamePair);

        // get the person with employee id with number 20
        System.out.println("idNamePair.get(20) = " + idNamePair.get(20));





//        // 1, Lilian -- 1 Lilian
//        String line = "1,Lilian";
//
//
//
//        idNamePair.put(id, name);
//        System.out.println("idNamePair = " + idNamePair);



 //        allData.forEach(eachLine -> System.out.println("eachLine = " + eachLine));       LAMBDA EXPRESSION






    }
}
