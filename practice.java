import java.util.Scanner;
import java.util.Random;

import javax.sql.rowset.spi.SyncResolver;

public class practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for rock scirror and paper: 0, 1, 2");
        
        
        int n = 0;
        while (n < 5) {
            int num1 = sc.nextInt();
            int num = rand.nextInt(3);
            // 0              1                   2
            //rock           paper             scissors
            if (num == 0 && num1 == 0) {
                System.out.println("Draw");
            } else if (num == 0 && num1 == 1) {
                System.out.println("You win");
            } else if (num == 0 && num1 == 2) {
                System.out.println("You lose");
            } else if (num == 1 && num1 == 0) {
                System.out.println("You lose");
            } else if (num == 1 && num1 == 1) {
                System.out.println("Draw");
            } else if (num == 1 && num1 == 2) {
                System.out.println("You win");
            } else if (num == 2 && num1 == 0) {
                System.out.println("You win");
            } else if (num == 2 && num1 == 1) {
                System.out.println("You lose");
            } else if (num == 2 && num1 == 2) {
                System.out.println("Draw");
            }

            n++;
        }
    

        
 
       

    }
    
}
