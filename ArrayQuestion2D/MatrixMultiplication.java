// package ArrayQuestion2D;

import java.util.Scanner;

public class MatrixMultiplication {

    /*-----------multiplication of two matrices------------------------ */

    static void mulArray(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (c1 != r2) {
            System.out.println("Multiplication of Matrices Not Possible-Wrong dimension");
            return ;
        }
            int [][] ans = new int[r1][c2];

            for (int i = 0; i < r1; i++) { //row number
                for (int j = 0; j < c2; j++) { //column number xsa
                    for (int k = 0; k < c1 ; k++) {
                        /*
                         ans[i][j] = ith row of a * jth row of b
                         */
                        ans[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
                printMatrix(ans);
        }

        static void printMatrix(int[][] mul){
            System.out.println("Multiplication matrix is :");
            for (int i = 0; i < mul.length; i++) {
                for (int j = 0; j < mul[i].length; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no of 1 matrix:");
        int r1 = sc.nextInt();
        System.out.print("Enter column no of 1 matrix:");
        int c1 = sc.nextInt();
        int [][] a = new int[r1][c1];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < r1; i++) {
             for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
             }
        }

        System.out.print("Enter row no of 2 matrix:");
        int r2 = sc.nextInt();
        System.out.print("Enter column no of 2 matrix:");
        int c2 = sc.nextInt();
        int [][] b = new int[r2][c2];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < r2; i++) {
             for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
             }
        }

        mulArray(a, r1, c1, b, r2, c2);
    }
}
