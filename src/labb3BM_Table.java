import java.util.Random;

public class labb3BM_Table {
    public static void main(String[] args) {
        //skapat ett objekt
        Random randomNum = new Random();

        int numRows = randomNum.nextInt(15) + 1;






        for(int i = 1; i <= numRows; i++) {

            for(int column = 1; column <= 12; column++){
                System.out.printf("%4d", i * column);
            }
        }






    }


}
