package javaPrograms.ExceptionHandling;

public class intro {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        catch(Exception e) {
            System.out.println("Exception");
        }
        finally{
            System.out.println("Finally block");
        }

    }
}
