import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        int secretNumber=7;
        int userGuess=0;

        while(!(userGuess==secretNumber)) {
            System.out.println("Guess the Number(1-9)");
            userGuess=keyboard.nextInt();

            if (!(userGuess==secretNumber)){
                System.out.println("Wrong answer...Try again");
            }

        }
        System.out.println("COngratulations");
        keyboard.close();
    }

    
}
