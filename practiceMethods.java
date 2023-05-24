
import java.util.Scanner;


public class practiceMethods {

    static int fibnocii(int n) {
        // if(n==1)
        //     return 0;
        if (n == 2 || n == 1)
            return 1;
        else {
            return fibnocii(n - 1) + fibnocii(n - 2);
        }
    }

    static void printingStars(int n)
    {
        if (n > 0) {
            
            printingStars(n - 1);

             for (int i = 0; i < n; i++)
                System.out.print(" * ");
                
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int k;
        // k = fibnocii(n);
        // System.out.println(k);

        printingStars(5);
        
        
    }
}
