import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class oddEvenBitwise{
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new oddEvenBitwise();
        System.out.print("Enter your num:");
        int num = sc.nextInt();
        if ((num & 1) == 1){
            System.out.println("Number is odd");
         }
        else {
            System.out.println("Number is even");
        }

        
        sc.close();
    }
}



