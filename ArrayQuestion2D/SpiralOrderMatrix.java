import java.util.Scanner;

public class SpiralOrderMatrix {

    //------------ spiral order matrix importanat concept -----------
    //---------------------Leetcode 59--------------------
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int[][] matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElement = 0;

        while (totalElement < r*c /*basically we are looping until all eleents printed row*col */) {
                 /*we can add multiple condition in loops  */
            //1.topRow -> leftCol - rightCol
            for(int j =leftCol; j <= rightCol && totalElement < r*c;j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++; //this for not repeating the previous element which already get printed in toprow
            
            //2.rightCol -> topRow - bottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r*c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--; //this for not repeating the previous element which already get printed in rightcol

            //3.bottomRow -> rightCol - leftCol
            for (int j = rightCol; j >= leftCol && totalElement < r*c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--; //this for not repeating the previous element which already get printed in bottomrow

            //4.leftCol -> bottomRow - topRow
            for (int i = bottomRow; i >= topRow && totalElement < r*c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++; //this for not repeating the previous element which already get printed in leftcol
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter row no of matrix:");
        int r = sc.nextInt();
        System.out.print("Enter column no of matrix:");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < r; i++) {
             for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
             }
        }
        System.out.println("Original Matrix:");
        printMatrix(arr);
        System.out.println("Spiral Order :");
        spiralMatrix(arr, r, c);
        sc.close();
    }
}
