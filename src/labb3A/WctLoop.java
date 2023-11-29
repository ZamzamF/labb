package labb3A;
import java.util.Scanner;
public class WctLoop {
    public static void main(String[] args) {
        // Deklarerar variabler för vindhastighet, utetempuratur och WindChill-beräkning. Variablerna är av datatypen double för att få med decimaler.
        double windSpeed, tempurature, WindChillcalc;
        String repeat = "ja"; // Deklarerad variabel kopplad till while loopen.

        // Skapar en  Scanner-objekt.
        Scanner myObj = new Scanner(System.in);

        // En if statement nestad i en while loop. While loopen loopar sitt innehåll så länge användaren svarar ja.
        // Metoden equalsIgnoreCase tillåter ptogrammet att läsa in versaler och gemener.
        while(repeat.equalsIgnoreCase("Ja")) {

            // Användaren uppmanas att ange temperatur i celsius. Sedan skrivs detta ut i konsolen.
            System.out.println("Ange utetemperaturen i celcius: ");
            tempurature = myObj.nextDouble(); // Tar användarens inmatning och sparar i variabeln tempurature.

            // Användaren uppmanas att ange vindhastigheten i km/h. Sedan skrivs detta ut i konsolen.
            System.out.println("Ange vindhastigheten i km/h: ");
            windSpeed = myObj.nextDouble(); // Tar användarens inmatning och sparar i variabeln windSpeed.

            // Här görs en uträkning av wind chill faktorn, genom beräkna temperaturen och vindhastigheten.
            WindChillcalc = 13.12 + 0.6215 * tempurature - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * tempurature * Math.pow(windSpeed, 0.16);

            // Skriver ut resultatet med två decimaler.
            System.out.printf("Windchill faktorn är: %.2f ", WindChillcalc);

            // En if statement som skriver ut meddelanden beroende på WCT
            if(WindChillcalc > -25){
                System.out.println("Det är kallt");
            } else if (WindChillcalc >= -35) {
                System.out.println("Det är mycket kallt");
            } else if (WindChillcalc >= -60) {
                System.out.println("Det finns risk för frostskada");
            } else{
                System.out.println("Det finns stor risk för frostskada");
            }
            System.out.println("Vill du fortsätta?");
            repeat = myObj.next(); //
        }

    }
}
