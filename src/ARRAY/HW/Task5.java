import STRING.classWork.Task2;

public class Task5 {
    static void main() {
        int[][] board ={
                {2, 0, 2},
                {2, 2, 0},
                {2, 1, 2}
        };
        checkWinner(board);}


public static void checkWinner(int[][] board) {
    int n = board.length;
    int winner = 0;

    for (int i = 0; i < n; i++) {
        if (board[i][0] != 0) {
            boolean rowWin = true;
            for (int j = 1; j < n; j++) {
                if (board[i][j] != board[i][0]) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin){
                winner= board[i][0];
            }
        }
    }

    if (winner == 0) {
        for (int j = 0; j < n; j++) {
            if (board[0][j] != 0) {
                boolean colWin = true;
                for (int i = 1; i < n; i++) {
                    if (board[i][j] != board[0][j]) {
                        colWin = false;
                        break;
                    }
                }
                if (colWin) winner = board[0][j];
            }
        }
    }

    if (winner == 0 && board[0][0] != 0) {
        boolean diagWin = true;
        for (int i = 1; i < n; i++) {
            if (board[i][i] != board[0][0]) {
                diagWin = false;
                break;
            }
        }
        if (diagWin) winner = board[0][0];
    }

    if (winner == 0 && board[0][n - 1] != 0) {
        boolean sideDiagWin = true;
        for (int i = 1; i < n; i++) {
            if (board[i][n - 1 - i] != board[0][n - 1]) {
                sideDiagWin = false;
                break;
            }
        }
        if (sideDiagWin) winner = board[0][n - 1];
    }

    if (winner != 0) {
        System.out.println("Победил игрок №" + winner);
    } else {
        System.out.println("Победителя нет.");
    }
}}

