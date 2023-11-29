package labb4;

import java.util.Random;

public class ConsolAppWeather {
    public static void main(String[] args) {
        /* Alla variabler */
        int medTemp = 0;
        double medTempSum;
        /* Deklarerar Arrayer*/
        int[] temp = new int[32];
        String[] days = new String[32];
        /* Skapar ett Random Objekt från Random klassen*/
        Random slumpTemp = new Random();


        /* Hälsningsfras till menyn */
        System.out.println("Hej och välkommna till ConsolAppWeather ");
        System.out.println();

        System.out.println("Vad vill du göra idag? Välj en åtgärd: ");
        System.out.println();

        System.out.println("1. Lista över temperaturdata för varje dag i maj\n  2. Medeltemperaturen i maj\n 3. Högsta temperatur och dag i maj\n 4. Lägsta temperatur och dag i maj;\n  5. Mediantemperaturen i maj\n6. Sortera temperaturdata\n7. Filtrera temperaturdata över tröskelvärde\n  8. Temperatur för en specifik dag och dess grannar\n   9. Vanligast förekommande temperatur i maj\nAvsluta\n");
        System.out.println();

        /*-------------- Första funktionen --------------------------*/

        // Loopar in värden i dessa Arreyer
        for(int t = 1; t < temp.length; t++){
            /* temp[] fylls med ett random tal mellan 1 - 31*/
            temp[t] = slumpTemp.nextInt(31) + 1;
            /* days[] fylls  med ett tal mellan 1 - 31*/
            days[t] = String.valueOf((t));

            if (t == 1 || t == 2 || t == 21 || t == 22 || t == 31){
                System.out.println(t + ":a Dagen var temperaturen " + temp[t]);
            } else {
                System.out.println(t + ":e Dagen var temperaturen " + temp[t]);
            }
        }

        /*-------------- Andra funktionen --------------------------*/
        System.out.println("----------------------------------");
       for(int i = 1; i < temp.length; i++) {

           i += temp[i];

       }

























































    }
}
