// package ArrayQuestion2D;

import java.util.Scanner;

public class PascalTriangle {

    // pascal triangle is a very important concept 
    // lecture no 21 raghav garg (again see the lecture tomorrow for dry run)

    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascalTriangle(int n){
        int[][] ans = new int[n][]; //column not specified because each row can contain different columns
        //which is called jagged array

        for (int i = 0; i < n; i++) {
            //ith row has i+1 columns
            ans[i] = new int[i+1];

            //1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;
            
            for (int j = 1; j < i; j++) {
                    ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
            return ans;
     }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows :");
        int n = sc.nextInt();

        int[][] pascal =pascalTriangle(n);

        printMatrix(pascal);
        
        // printMatrix(pascal);

     sc.close();
    
    }
}
