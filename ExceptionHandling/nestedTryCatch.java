// package javaPrograms.ExceptionHandling;

public class nestedTryCatch {
    public static void main(String[] args) {
        int a[] = { 10, 44, 2, 6, 0 };

        try {
            int c = a[0] / a[2];
            System.out.println("Division is " + c);

            try {
                System.out.println(a[2]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is out of Bound");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        System.out.println("End of Program");
    }
}
