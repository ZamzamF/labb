/*
 Fixa: När temperaturen är samma på två ställen. vill vi att det ska vara tydligt att det är det
 Fixa: Sjätte fubktionen. Det blir en sortering men det börjar på 0. ??
*/
package labb4;

import java.util.Arrays;
import java.util.Random;

public class ConsolAppWeather {
    public static void main(String[] args) {
        /* Alla variabler */
        double eachRandomTemp = 0;
        double medTempSum = 0;
        int highestTemp = 0;
        int highestTempDay = 0;
        int lowestTemp = Integer.MAX_VALUE;
        int lowestTempDay = 1;


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
        System.out.println("Första funktionen");
        // Loopar in värden i dessa Arreyer
        for(int t = 1; t < temp.length; t++){
            /* temp[] fylls med ett random tal mellan 1 - 31*/
            temp[t] = slumpTemp.nextInt(31) + 1;
            /* days[] fylls  med ett tal mellan 1 - 31*/
            days[t] = String.valueOf((t));
            /*Vi tar det random temp som genererats och sparar den i medTempSum */
            medTempSum += temp[t];


            if (t == 1 || t == 2 || t == 21 || t == 22 || t == 31){
                System.out.println(t + ":a Dagen var temperaturen " + temp[t]);
            } else {
                System.out.println(t + ":e Dagen var temperaturen " + temp[t]);
            }

        }


        /*-------------- Andra funktionen --------------------------*/
        System.out.println("Andra funktionen");
        eachRandomTemp = medTempSum / (temp.length - 1);
        System.out.println("med temp är:::::::::" + eachRandomTemp);

        /*-------------- Tredje funktionen --------------------------*/
        System.out.println("Tredje funktionen");
        for (int t = 2; t < temp.length; t++) {
            if (temp[t] > highestTemp) {
                highestTemp = temp[t];
                highestTempDay = t;
            }
        }
        System.out.println("Högsta temperaturen i maj var " + highestTemp + " grader Celsius på dag " + highestTempDay);


        /*-------------- Fjärde funktionen --------------------------*/
        System.out.println("Fjärde funktionen");

        for (int t = 1; t < temp.length; t++) {
            if (temp[t] < lowestTemp) {
                lowestTemp = temp[t];
                lowestTempDay  = t;
            }
        }
        System.out.println("Lägsta temperaturen i maj var " + lowestTemp + " grader Celsius på dag " + lowestTempDay);


        /*-------------- Femte funktionen --------------------------*/
        System.out.println("Femte funktionen");

        Arrays.sort(temp); /* Sorterar temp[]*/
        int wholeArray = temp.length;
        /* Loop som beräknar medianen*/
        if (wholeArray % 2 == 0) {
            // Jämnt antal observationer
            int mid1 = temp[wholeArray / 2 - 1];
            int mid2 = temp[wholeArray / 2];
            double median = (double)(mid1 + mid2) / 2;
            System.out.println("Median temperaturen i maj är: " + median);
        } else {
            // Udda antal observationer
            int mid = temp[wholeArray / 2];
            System.out.println("Median temperaturen i maj är: " + mid);
        }

        /*-------------- Sjätte funktionen --------------------------*/
        System.out.println("Sjätte funktionen");
        Arrays.sort(temp);
        System.out.println("Ursprunglig array: " + Arrays.toString(temp));

































































    }




}
