import java.util.Scanner;

// import javax.swing.JApplet;

public class basicPattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
      //  System.out.print("Enter No of Rows:");
      //  int  n = sc.nextInt();
        // *
        // **
        // ***
        // ****
        // *****
    // for(int i = 1;i <= n;i++){
    //      for(int j = n;j >= i;j--){
    //         System.out.print("*");
    //      }
    //     System.out.println();
    // }
    // }

//           *
//         * *
//       * * *
//     * * * *
//   * * * * *
//     for(int i = 1;i <= n;i++){
//         // for spaces 
//          for(int j = 1;j <= (n-i);j++){
//                 System.out.print(" ");
//              }
//          // for stars
//          for(int k = 1;k <= i;k++){
//             System.out.print("*");
//          }
//             System.out.println();

// }
// 1
// 2 3
// 4 5 6
// 7 8 9 10 
// 11 12 13 14 15
// int a = 0;
//    for(int i = 1; i <= n; i++ ){
//       for(int j = 1 ;j <= i; j++ ){
//          a++;
//          System.out.print(a+" ");
//       }
//       System.out.println();
//    }
 
/*

 *****
 *   *
 *   *
 *   *
 *****   n = 5

 */
// for (int i = 1; i<=n; i++){
//    for (int j = 1; j<=n; j++){
//       if (i == 1 || i == 5 || j == 1 || j == 5){
//          System.out.print("*");
//       }
//       else{
//          System.out.print(" ");
//       }
//    }
//    System.out.println();
// }


/*
J
JA 
JAV 
JAVA
*/

String str = "JAVA",cstr = "" ;
for (int i = 0;i<str.length();i++) {
   cstr += str.charAt(i);
   for (int j = 0;j<=i;j++){
      System.out.print(cstr.charAt(j));

   }
   System.out.println();
}

//  1 2 3 4 5 6
//  2 3 4 5 6 1
//  3 4 5 6 1 2
//  4 5 6 1 2 3
//  5 6 1 2 3 4
//  6 1 2 3 4 5

for (int i = 1; i <= num; i++) {
   for (int j = i; j <= num; j++) {
     System.out.print(j + " ");
   }
   int n = 1;
   for (int k = num-i; k <num-1; k++) {
       System.out.print(n + " " );
       n++;
   }
   System.out.println();
   
}
   
// 0-1 traingle
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

for (int i = 0; i < 6; i++) {
   for (int j = 0; j <=i; j++) {
       if ((i+j)%2 == 0) {
           System.out.print('1' + " ");
       }else {
           System.out.print('0' + " ");
       }
   }
   System.out.println();
}


   sc.close();
   


  }
      
 }



