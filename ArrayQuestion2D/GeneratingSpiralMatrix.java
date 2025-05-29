import java.util.Scanner;

public class GeneratingSpiralMatrix {
    /*IMPORTANT *********************LEETCODE  */
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

   static void generateSpiralMatrix(int[][] matrix,int n){
        int toprow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int totalElement=0,value =1;

        while (totalElement < n*n) {
            // for  toprow 
            for(int j = leftCol; j <= rightCol && totalElement < n*n; j++){
                matrix[toprow][j] = value;
                value++;
                totalElement++;
            }
            toprow++;

            // for rightcol 
            for(int i = toprow ; i <= bottomRow && totalElement < n*n; i++){
                matrix[i][rightCol] = value;
                value++;
                totalElement++;
            }
            rightCol--;

            // for bottomRow
            for (int j = rightCol; j >= leftCol && totalElement < n*n; j--) {
                matrix[bottomRow][j] = value;
                value++;
                totalElement++;
            }
            bottomRow--;

            // for leftCol 
            for (int i = bottomRow; i >= toprow && totalElement < n*n; i--) {
                matrix[i][leftCol] = value;
                value++;
                totalElement++;
            }
            leftCol++;

        }
   }


   public static void main(String[] args) {

    // OUE : The user input n positive integer ,we have generate matrix of n*n(n -> n^2)
    // in spiral order 

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Rows & Colums :");
        int n = sc.nextInt();

        int[][] sp = new int[n][n];

        generateSpiralMatrix(sp,n);
        printMatrix(sp);
   }
}
