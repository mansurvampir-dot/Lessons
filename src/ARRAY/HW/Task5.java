package ARRAY.HW;

public class Task5 {
    static void main() {
        task5();
    }

        public static void task5() {
            int[][] board = {
                    {2, 0, 2},
                    {2, 2, 0},
                    {2, 1, 2}
            };

            int winner = 0;
            for (int i = 0; i < 3; i++) {
                if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                    winner = board[i][0];
                }
                if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                    winner = board[0][i];
                }
            }
            if (winner == 0 && board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                winner = board[0][0];
            }
            if (winner == 0 && board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                winner = board[0][2];
            }
            if (winner != 0) {
                System.out.println("Победил игрок №" + winner);
            } else {
                System.out.println("Победителя пока нет или ничья.");
            }
        }
    }
