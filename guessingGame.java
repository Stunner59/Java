import java.util.Scanner;
import java.util.Random;

class Game {

    int number;
    int inputNumber;
    int numcount = 0;

    Game() {
        Random rand = new Random();
        number = rand.nextInt(100);
        // System.out.println(number);
    }

    Scanner sc = new Scanner(System.in);
    int input() {
        System.out.println("Guess a Number!!");
        inputNumber = sc.nextInt();
        return inputNumber;

    }

    boolean checkNumber() {

        numcount++;
        if (number == inputNumber) {
            System.out.println("Congratulations you guessed it right in " + numcount + " attempts!!");

            return true;
        } else if ((inputNumber < (number + 5) && inputNumber > (number - 5))) {
            System.out.println("Number is near");
        } else if (inputNumber > number) {
            System.out.println("Number too High!!");

        } else if (inputNumber < number) {
            System.out.println("Number too Low!!");

        }
        return false;

    }
    void Close(){

        sc.close();
    }

}

public class guessingGame {
    public static void main(String[] args) {

        boolean b = false;
        Game G = new Game();

        while (!b) {
            G.input();
            b = G.checkNumber();            
        }
        System.out.println("Good Bye!!, See you Next Time!!");

    G.Close();

    }

}
