import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        // Validate input
        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot! Enter between 1 and 9.");
        } else {
            // Convert slot to row and column
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            System.out.println("Row: " + row);
            System.out.println("Column: " + col);
        }

        sc.close();
    }
}