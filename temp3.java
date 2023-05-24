import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class temp3 {
    public static void main(String[] args) {
        int num, rev = 0, n;
        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter a number :");

        // num = scan.nextInt();

        // num = 1234;
        // String str = "";

        // while (num > 0) {
        // n = num % 10;
        // // rev = rev * 10 + n;
        // str = str + n;
        // num = num / 10;

        // }

        // System.out.println("Reverse of the number is : " + str);

        // gp series
        // int a ,r;
        // int term = a;
        // for (int i = 0; i < n; i++) {

        // System.out.println(term);
        // term = term * r;
        // }

        // write a program
        // int k = scan.nextInt();
        // for (int i = 1; i <= k; i++) {
        // if (i>=10 && i<=20) {
        // continue;
        // }
        // System.out.println(i);

        // }
        n = 1;
        // System.out.println(n++);
        // System.out.println(++n);

        // array
        // int A[] = new int[5];
        int A[] = { -1,-2,-3,-4,-5 };
          int max1=A[0];
            int max2=A[0];
            for (int i = 0; i < A.length; i++) {

                if (A[i] > max1) {
                    max2 = max1;
                    max1 = A[i];
                }
                else if(A[i]>max2){
                    max2=A[i];
                }
            }

        System.out.println(max2);

    }

}