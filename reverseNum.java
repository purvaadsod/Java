import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int reverN = reverse(num);
        System.out.println("The reverse = " + reverN);
        sc.close();
    
    }
     public static int reverse(int n){
        int newNum = 0;
        while (n > 0) {
            int digit = n % 10;
            newNum = newNum * 10 + digit;
            n = n / 10;
        }
        return newNum;
    }

}
