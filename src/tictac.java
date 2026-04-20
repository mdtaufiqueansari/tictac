class TicTacToe {
    public static void main(String[] args) {

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // Display board
        System.out.println("Tic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {
            System.out.print(" ");

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }
}