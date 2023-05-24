import java.util.Random;
import java.util.Scanner;

class gameGuess {
    
    public int num;
    public int noOfguess;
    public int count=0;
    public int take;

 
      public gameGuess() {
        Random rand = new Random();
        num = rand.nextInt(100);
    }

    //take user input;
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your guess");
            take= sc.nextInt();
    }

    //check the number
    public boolean checkNumber() {
        count++;
        if (take == num) {
            System.out.printf("you won your \n guess is %d and no of guess is %d", take, count);

            return true;
        }
        else if (num > take) {
            System.out.println("your guess is too low");

        }
        else if (num < take) {
            System.out.println("your guess is too high");
        }
        return false;
    }
  
    
}
public class guessNumber {

    public static void main(String[] args) {

        gameGuess obj = new gameGuess();
        // obj.takeUserInput();
        // boolean b = obj.checkNumber();
        // System.out.println(b);
        boolean b = false;
        while (!b) {
            obj.takeUserInput();
            b = obj.checkNumber();
        }
        
    }
    
}
