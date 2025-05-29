// package ArrayQuestion2D;

import java.util.Scanner;

public class Rotating2DArray90Degree {

// ----------------------- **Leetcode - 48 Easy question**-------------------------//
//square matrix (row == col)

static void printMatrix(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
    
     static void reverse(int[] a){
         int i=0,j=a.length-1;

         while (i < j) {
            int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
         }
    }

    static void findTranspose(int[][] arr,int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // transpose[i][j] = arr[j][i]; this one method

                /*swaping this is another in place method
                 * note- we have to initialize j with i 
                 */

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotate(int[][] arr,int r,int c){
        // for getting 90deg rotated matrix first need transpose
        // and then reverse each row
        findTranspose(arr, c); //r == c
         for (int i = 0; i < r; i++) {
            /*
             1 2 3
             4 5 6
             7 8 9

             i = 0
             reverse({1,2,3})
             */
                 reverse(arr[i]); 
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
     
       rotate(arr, r, c);
//---if we change array in function or any where it does the change in actual array ---------//
// so i dont need to return the array and store it in other array ,it take change in actual array
        
        System.out.println("The 90deg rotated matrix is:");
        printMatrix(arr);

        sc.close();
    }
}
