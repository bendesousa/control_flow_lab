import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
//        Prompt the user to input a number
        System.out.println("Guess the Secret Number");
//        Collect user input
        Scanner reader = new Scanner(System.in);
          int guessNumber = reader.nextInt();
//        If the number is correct, print "You got it!"
//        Otherwise print either too low or too high
        if (guessNumber == 77){
            System.out.println("You got it!");
        } else if (guessNumber < 77){
            System.out.println("Too low!");
        } else if (guessNumber > 77){
            System.out.println("Too high!");
        }
    }

}
