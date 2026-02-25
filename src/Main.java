class Main {
    public static void main(String[] args) {

        // создаём массив из 5 строк (пока без столбцов)
        int[][] matrix = new int[5][];

        // создаём строки разной длины
        for (int i = 0; i < 5; i++) {
            matrix[i] = new int[i + 1];
        }

        int k = 0;

        // заполняем массив числами
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = k;
                k++;
            }
        }

        // выводим массив
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
    }
}
