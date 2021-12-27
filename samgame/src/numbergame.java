import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class numbergame {

    public static void main(String[] args) {


        String userinput;
        Scanner input = new Scanner(System.in); // input
        // random number generator
        System.out.println();

        do {


            playinggame(input);


            System.out.println("you guessed correctly");
            System.out.println("would you like to play again press Y for yes and N for no");
            userinput = input.next();

        }

        while (userinput.equalsIgnoreCase("y") || userinput.equalsIgnoreCase("Yes"));

    }


    public static void playinggame(Scanner input)

    {
        int value1 = 0;
        int y = ThreadLocalRandom.current().nextInt(1, 100);
        do {
            System.out.println("Enter a number between 1 and 100"); /// asking the user to enter a value

            value1 = input.nextInt(); // value would be stored in x


            //   do

            //  System.out.println("Chose a number lower than your guess");


            if (value1 > y) {
                System.out.println("Chose a number lower than your guess");
            } else {
                System.out.println("Chose a number higher than your guess");
            }

        }

        while (value1 != y);

    }

}

