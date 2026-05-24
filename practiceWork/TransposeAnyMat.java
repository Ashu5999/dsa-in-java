package practiceWork;
import java.util.*;
public class TransposeAnyMat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  // this work for matrix wheather it is square or not 
        int n= sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int arr1[][] = new int[m][n];

        for(    int i = 0; i<n;i++){
            for(int j = 0; j<m ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
      for(int j = 0; j<m ;j++){
        for(int i = 0; i<n;i++){
            arr1[j][i] = arr[i][j];
        }
      }
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n ;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        
    }
}
}

/* 
Transpose of Any Matrix

1. Take matrix of size n × m.
2. Create new matrix of size m × n.
3. Traverse original matrix using nested loops.
4. Store:
   transpose[j][i] = arr[i][j]
5. Print transpose matrix.

TC → O(n × m)
SC → O(m × n)
 */
