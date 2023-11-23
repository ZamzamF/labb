package labb3B;

import java.util.Random;
public class Multi_Table_Loop {
    public static void main(String[] args) {
        //Skapat ett random objekt.
        Random randomNum = new Random();
        // Som sedan används för att fylla variabeln numRows med ett random nummer mellan 1 - 15.
        int numRows = randomNum.nextInt(15) + 1;


        // En for-loop som skriver header raden. I de fall då i är >= 11 inkrementeras i med 1.
        for(int i = 1; i <= 11; i++) {
            System.out.printf("%4d", +i); // PrinF gör att varje gång i skrivs ut görs den med bredden av 4 karaktärer.

        }
        System.out.print("\n-----------------------------------------------");
        System.out.println(); // Skapar en radbrytning.



        /* Den yttersta for-loopen har hand om alla rader i tabelen
        och avgör antalet rader som produceras. Med hjälp av numRows variablen,
        som i sin tur innehåller utnytjar random objektet.*/

        for(int row = 1; row <= numRows; row++) {
            System.out.print(row + "| " ); // Här skapas en extra rad utanför loopen.

            // Den innersta for-loopen anvarar för alla columner i tabelen och även utför uträkningen.
            for(int col = 1; col <= 11; col++){
                System.out.printf("%-4d", row * col);

            }
            System.out.println();// Skapar en radbrytning.
        }

    }
}
