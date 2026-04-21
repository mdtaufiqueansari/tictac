import java.util.Scanner;
import java.util.Random;

class TicTacToe{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Toss Time!");
        System.out.print("Player 1, choose Head or Tail (H/T): ");
        char choice = sc.next().toUpperCase().charAt(0);

        // Toss (0 = Head, 1 = Tail)
        int toss = rand.nextInt(2);
        char result = (toss == 0) ? 'H' : 'T';

        System.out.println("Toss Result: " + (result == 'H' ? "Head" : "Tail"));

        String firstPlayer;
        String secondPlayer;

        if (choice == result) {
            System.out.println("Player 1 wins the toss!");
            firstPlayer = "Player 1";
            secondPlayer = "Player 2";
        } else {
            System.out.println("Player 2 wins the toss!");
            firstPlayer = "Player 2";
            secondPlayer = "Player 1";
        }

        // Assign symbols
        System.out.println(firstPlayer + " will play first and gets 'X'");
        System.out.println(secondPlayer + " gets 'O'");
    }
}
