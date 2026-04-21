public class tictactoe {

    public static void main(String[] args) {

        // Create empty board with positions 1–9
        char[][] board = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'}
        };

        // Display the board
        System.out.println("Empty Tic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");

                // Add vertical separator
                if (j < 2) {
                    System.out.print("| ");
                }
            }
            System.out.println();

            // Add horizontal separator
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }
}