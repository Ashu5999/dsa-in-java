public class searchElement{
    public static boolean staircase(int matrix[][], int key){
        int row =0 , colm= matrix[0].length-1;

        while (row<matrix.length && colm>=0){
            if (matrix[row][colm]==key){
                System.out.print("found key at ( " +  row + "," + colm+")");
              return true;
            }
            else if (key < matrix[row][colm]){
                colm--;
            }
            else{
                row++;
            }
        }
        System.out.print("no key found ");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16} };
            int key = 11;
    staircase(matrix, key);
    }
}
