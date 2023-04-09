import java.util.Random;
import java.util.Scanner;

public class Game {

    public static int userNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose a number between 0 and 100!");
        return scanner.nextInt();
    }

    public static int computerNumber(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void checkInput(int number1){
        if(number1 > 100 || number1 < 0){
            System.out.println("Invalid number");
        }
    }

    public static void main(String[] args){

        int randomNumber = computerNumber();
        int guessNumber = userNumber();

        while(true){

            checkInput(guessNumber);

            if (guessNumber == randomNumber) {
                System.out.println("Congratulations, you won!");
                break;
            } else if (guessNumber < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            guessNumber = userNumber();
        }
    }
}
