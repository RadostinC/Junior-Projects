import java.util.Random;
import java.util.Scanner;

public class GeneratedNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to my game! ");
        System.out.println("Choose number between 1 and 10");
        System.out.println("If your number is equal to random generated number, you win!");
        System.out.println("You have only three chances!");
        System.out.println("Good luck!");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Random random = new Random();
        int computerRandom = random.nextInt(1, 10);
        int counter=3;


        while (input != computerRandom) {


            if (input<1||input>10) {// не трябва да е по-малко  от 0
                System.out.println("Please, type number between 1 and 10");
                counter++;
            }
            if ( input>=1&&input<=10) {
                if (counter==1){
                    System.out.println("You have no more chances!");
                    System.out.println("You lose!");
                    break;
                }
                System.out.println("You lose! ");
                System.out.println("Try again!");
            }
            counter--;
            input = Integer.parseInt(scanner.nextLine());
        }
        if (input == computerRandom) {
            System.out.printf("Your number %d is equal to random generated  number %d!%n", input, computerRandom);
            System.out.println("You win!");
        }
    }
}