package day12;

public class WakeUp_CodeInWeather {

    public static void main(String[] args){
        // WAKE UP TASK :
        //Create a variable to store the weather of your city right now :
        //And write a if else if else statement to do following
        //If Weather Sunny ——>>  Code in Sunny weather
        //If Weather Rainy ——>>  Code in Rainy weather
        //If Weather Cloudy  ——>>  Code in Cloudy weather
        //If Weather Snowy  ——>>  Code in Snowy weather
        //Else   —>> rain or shine just keep coding anyway !!!

                String weather = new String("Sunny");
        if (weather.equals("Sunny")){
            System.out.println("Sunny weather");
        }else if (weather.equals("Rainy")){
            System.out.println("Rainy weather");
        }else if (weather.equals("Cloudy")){
            System.out.println("Cloudy weather");
        }else if (weather.equals("Snowy")){
            System.out.println("Snowy weather");
        }else {
            System.out.println("Rain or shine just keep coding anyway");
        }




    }

}
