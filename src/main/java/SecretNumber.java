import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
//        Declare the secret number
        //int secretNumber = 77;
//        Prompt the user to input a number
        System.out.println("Guess the Secret Number");
//        Collect user input
        Scanner reader = new Scanner(System.in);
          int secretNumber = reader.nextInt();
//        If the number is correct, print "You got it!"
//        Otherwise print either too low or too high
        if (secretNumber == 77){
            System.out.println("You got it!");
        } else if (secretNumber < 77){
            System.out.println("Too low!");
        } else if (secretNumber > 77){
            System.out.println("Too high!");
        }
    }

}
