import java.util.Scanner;

class TicTacToeGame {
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of player 1: ");
        String p1 = in.nextLine();
        System.out.print(" Enter the name of player 2:");
        String p2 = in.nextLine();
        boolean player1 = true;
        boolean gameEnded = false;
        while (!gameEnded) {

            drawBoard(board);
            if (player1) {
                System.out.println(p1 + "'s Turn (x):");
            } else {
                System.out.println(p2 + "'s Turn (o):");
            }
            char c = '-';
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }
            int row = 0;
            int col = 0;
            while (true) {
                System.out.print("Enter a row number(0,1,2): ");
                row = in.nextInt();
                System.out.print("Enter a column number(0,1,2): ");
                col = in.nextInt();
                if (row < 0 || col < 0 || row >= n || col >= n) {
                    System.out.println("Invalid position");
                } else if (board[row][col] != '-') {
                    System.out.println("This position is already occupied");
                } else {
                    break;
                }
            }
            board[row][col] = c;
            if (playerHasWon(board) == 'x') {
                System.out.println(p1 + " has won!");
                gameEnded = true;
            } else if (playerHasWon(board) == 'o') {
                System.out.println(p2 + " has won!");
                gameEnded = true;
            } else {
                if (boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {
                    player1 = !player1;
                }
            }
        }
        drawBoard(board);
    }

    public static void drawBoard(char[][] board) {
        System.out.println("Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static char playerHasWon(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            boolean inARow = true;
            char value = board[i][0];
            if (value == '-') {
                inARow = false;
            } else {
                for (int j = 1; j < board[i].length; j++) {
                    if (board[i][j] != value) {
                        inARow = false;
                        break;
                    }
                }
            }
            if (inARow) {
                return value;
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            boolean inACol = true;
            char value = board[0][j];
            if (value == '-') {
                inACol = false;
            } else {
                for (int i = 1; i < board.length; i++) {
                    if (board[i][j] != value) {
                        inACol = false;
                        break;
                    }
                }
            }
            if (inACol) {
                return value;
            }
        }
        boolean inADiag1 = true;
        char value1 = board[0][0];
        if (value1 == '-') {
            inADiag1 = false;
        } else {
            for (int i = 1; i < board.length; i++) {
                if (board[i][i] != value1) {
                    inADiag1 = false;
                    break;
                }
            }
        }
        if (inADiag1) {
            return value1;
        }
        boolean inADiag2 = true;
        char value2 = board[0][board.length - 1];
        if (value2 == '-') {
            inADiag2 = false;
        } else {
            for (int i = 1; i < board.length; i++) {
                if (board[i][board.length - 1 - i] != value2) {
                    inADiag2 = false;
                    break;
                }
            }
        }
        if (inADiag2) {
            return value2;
        }
        return ' ';
    }

    public static boolean boardIsFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
