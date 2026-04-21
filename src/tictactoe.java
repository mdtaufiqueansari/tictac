import java.util.Scanner;

public class tictactoe {

    // Method to validate user move
    public static boolean isValidMove(char[][] board, int slot) {

        // Check range
        if (slot < 1 || slot > 9) {
            return false;
        }

        // Convert slot to row and column
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        // Check if position is already filled
        if (board[row][col] == 'X' || board[row][col] == 'O') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize board
        char[][] board = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'}
        };

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        if (isValidMove(board, slot)) {
            System.out.println("Valid Move ✅");

            // Example: place 'X'
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;
            board[row][col] = 'X';
        } else {
            System.out.println("Invalid Move ❌");
        }

        // Display board
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}