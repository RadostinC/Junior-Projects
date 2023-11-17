import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void Main(){
        System.out.println("Welcome to my game ");
        System.out.println("If you want to play, you need to choose number for 1 to 20");
        System.out.println("If your number is equal to random number, you win!");
        Scanner scanner =new Scanner(System.in);
        int input=Integer.parseInt(scanner.nextLine());
        Random random=new Random();
       int  computerRandom=random.nextInt(1,20);

       if(input==computerRandom){
           System.out.printf("Your number %d is equal to random generated %d number",input,computerRandom);
           System.out.println("You win!");
       }else{
           System.out.println("You lose! ");
           System.out.println("Try again!");
       }

    }
}
