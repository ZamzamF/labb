package labb2;
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        // Deklarerar variabler för vindhastighet, utetempuratur och WindChill-beräkning. Variablerna är av datatypen double för att få med decimaler.
        double windSpeed;
        double tempurature;
        double windChillcalc;

        // Här skapas ett Scanner-objekt för att läsa in data från användaren.
        Scanner myObj = new Scanner(System.in);


        // Användaren uppmanas att ange temperatur i celsius. Sedan skrivs detta ut i konsolen.
        System.out.println("Ange utetemperaturen i celcius: ");
        tempurature = myObj.nextDouble(); // Tar användarens inmatning och sparar i variabeln tempurature.

        // Användaren uppmanas att ange vindhastigheten i km/h. Sedan skrivs detta ut i konsolen.
        System.out.println("Ange vindhastigheten i km/h: ");
        windSpeed = myObj.nextDouble(); // Tar användarens inmatning och sparar i variabeln windSpeed.

        // Här görs en uträkning av wind chill faktorn, genom beräkna temperaturen och vindhastigheten.
        windChillcalc = 13.12 + 0.6215 * tempurature - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * tempurature * Math.pow(windSpeed, 0.16);

        // Skriver ut resultatet med två decimaler (OBS! notera att det ska vara kommatecknet och INTE plus.)
        System.out.printf("Windchill faktorn är: %.2f", windChillcalc);


    }
}
