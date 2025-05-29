import java.util.*;
public class Loops {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    int n = sc.nextInt();
//     //  for loop
   
//     for (int i=1; i<=n ;i++){
//         System.out.println(i);
//    }


// int i = 1;
//         //    while loop
//      while (i <= n) {
//         System.out.println(i);
//         i++;
//       }


   int i = 1;
        // do-while loop
// here the code will run atlaest one time even if condition is false
        do {
            System.out.println(i);
            i++;
        } while(i<=n);

    
    // int[] names = new int[5];

// label break and label continue


// for-each loop
// this loop is used to iterate over Array

String names[] = {"abc","def","ghi","jkl","mno"};
for (String name : names) {
    System.out.println(name);    
}

int numbers[] = {10,54,89,74,12};
int max = numbers[0]; 
for (int number : numbers) {
    if (number > max ) {
        max = number;
    }
}
System.out.println("The maximum number in this array is " + max);


//          *
//        * * * 
//      * * * * *
//    * * * * * * *
System.out.print("Enter rows:");
int n = sc.nextInt();

for (int i = 0; i < n; i++) {
    for (int j = 0; i+j < n-1; j++) {
        // for spaces
        System.out.print(" ");
    }

    for (int j = 0; j < (2*i + 1); j++) {
        //for stars
        System.out.print("*");
    }
    System.out.println();
}


    sc.close();
    }
}
