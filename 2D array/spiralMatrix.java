public class spiralMatrix {
    public static void spiral(int matrix[][]) {
        int startRow = 0;
        int startColm = 0;
        int endRow = matrix.length - 1;
        int endColm = matrix[0].length - 1;

        while (startRow <=endRow && startColm <= endColm) {
            // top row
            for (int j = startColm; j <= endColm; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColm] + " ");
            }

            // bottom row
            for (int j = endColm - 1; j >= startColm; j--) {
                if (startRow == endRow) break; // already printed
                System.out.print(matrix[endRow][j] + " ");
            }

            // left column
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColm == endColm) break; // already printed
                System.out.print(matrix[i][startColm] + " ");
            }

            startRow++;
            endRow--;
            startColm++;
            endColm--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4,0},
            {5, 6, 7, 8,0},
            {9, 10, 11, 12,0},
            {13, 14, 15, 16,0},
            {0,0,0,0,0}
        };
        spiral(matrix);
    }
}
