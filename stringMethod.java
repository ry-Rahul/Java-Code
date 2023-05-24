import java.util.Scanner;

public class stringMethod {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        String name = "Rahul yadav";
        String b = new String("Rahul yadav");

        int value = name.length();
        System.out.println(name);
        // System.out.println(b);
        System.out.println("length of string is "+value);

        String lwstr = name.toLowerCase();
        System.out.println("lower case of string is "+lwstr);

        String upstr = name.toUpperCase();
        System.out.println("upper case of string is " + upstr);
        System.out.println();
        
        //trim method for string 
        String nonTrimmmed = "    hey meri javascript    ";
        System.out.println(nonTrimmmed);

        // using of trimmed method 
        String trimmed = "         hey js i want to say something     ";
        System.out.println(trimmed.trim());
        System.out.println();

        //substring of string
        /*
           012345678910
         * Rahul yadav
         * name.substring(2) means index 2 to end of the string 
        */

        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 8));
        System.out.println();
        
        //replace any char with other char
        System.out.println(name.replace(' ', '_'));
        System.out.println(name.replace("Rahul","sakshi"));
        System.out.println();

        //startWith("Ra") , endsWith()
        System.out.println(name.startsWith("Ra"));
        System.out.println();

        //charAt)
        System.out.println(name.charAt(2));
        System.out.println();

        //  indexOf()
        System.out.println(name.indexOf('a'));

        String str2 = "saaaakkshhaiiiii";
        System.out.println(str2.indexOf('a', 6));
        //lastIndexOf
        System.out.println(str2.lastIndexOf("sh",10));
        System.out.println();


        //name.equals
        System.out.println(name.equals("rahul yadav"));
        System.out.println();

        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("rahul yadav"));

       System.out.println("I am escape sequence \\ double quote");

    }
    
}
