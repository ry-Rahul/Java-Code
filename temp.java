import java.util.Scanner;

// Keshav is Store owner. In order to increase his sale he imposed a restriction on buying the Pencil, there is a restriction that the customer cant buy Pencil alone, the customer has to purchase eraser first then only he can buy Pencil but single eraser can be buyied individually.Develop a program in order to increase his sale.

// Input Format

// First line will contain an integer N representing number of items purchased.
// Second line will contain N space separated 1 or 2. 1 means eraser and 2 means pencil purchased.

// Constraints

// N can't be negative.
// Pencil cant be buyed without eraser. After fisrt line in the input the value should either be 1 or 2, otherwise output will be printed Invalid Input

// Output Format

// Valid Purchase/Invalid Purchase/ Invalid Input

public class temp{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++){
            if(arr[j]!=1 || arr[j]!=2){
                System.out.println("Invalid Input");
                break;
        }
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 2) {
                    if (i == 0) {
                        flag = 1;
                        break;
                    } else {
                        if (arr[i - 1] == 1) {
                            flag = 0;
                        } else {
                            flag = 1;
                            break;
                        }
                    }
                }
            }
            if (flag == 0) {
                System.out.println("Valid Purchase");
            } else {
                System.out.println("Invalid Purchase");
            }
        }

    }
}