import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Board representation (1–9 initially)
        char[] board = {'1','2','3','4','5','6','7','8','9'};

        int slot;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a slot number (1-9): ");
            slot = sc.nextInt();

            // Check range
            if (slot < 1 || slot > 9) {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
                continue;
            }

            // Check if slot is already taken
            if (board[slot - 1] == 'X' || board[slot - 1] == 'O') {
                System.out.println("Slot already occupied! Try another.");
            } else {
                validInput = true;

                // Example: assign 'X' (you can change based on player)
                board[slot - 1] = 'X';
            }
        }

        // Display updated board
        System.out.println("\nUpdated Board:");
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0)
                System.out.println();
        }

        sc.close();
    }
}