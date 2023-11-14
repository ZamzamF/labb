package labb1;

public class FlightsOutput { // Här skapas en klass med namnet FlightsOutput
    public static void main(String[] args) { // Här deklareras main metoden, där all kod befinner sig.

        // Uträkning för flyg från New York
        System.out.println("******************************************************************");
        System.out.println(); // Skapar en tom rad
        System.out.println("Vilken tid anländer flyget från New York i Stockholm?"); // Det här är en metod som skriver ut en sträng till konsolen
        System.out.println(); // Skapar en tom rad
        System.out.println("Avgångstid i NY kl. " + (5 + 5) + ":" + (5 + 5) + ", anländer i Stockholm kl. " + (10 + 7 + 6) + ":" + (30 + 5)); /*
       Här används samma metod för att göra en uträkning på avgångstiden och ankomstiden med åtanke på restid och tidsskillnad. */
        System.out.println(); // Skapar en tom rad
        System.out.println("******************************************************************");
        System.out.println(); // Skapar en tom rad
        // Uträkning för flyg från Stockholm
        System.out.println("Vilken tid anländer flyget från stockholm i NY?"); // Det här är en metod som skriver ut en sträng till konsolen
        System.out.println(); // Skapar en tom rad
        System.out.println("Avgångstid från Stockholm kl. " + (10 + 4) + ":" + 0 + 3 + ", anländer i NY kl. " + (14 + 7 - 6) + ":" + (3 + 25) ); /*
       Här används samma metod för att göra en uträkning på avgångstiden och ankomstiden med åtanke på restid och tidsskillnad. */
        System.out.println(); // Skapar en tom rad
        System.out.println("******************************************************************");

    }
}

