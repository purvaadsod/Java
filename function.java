import java.util.Scanner; // Scanner class used for taking input from user

public class function {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number:");
    int a = sc.nextInt();
    System.out.print("Enter a number:");
    int b = sc.nextInt();
    System.out.print("Enter a number:");
    int c = sc.nextInt();
    int add = sumOf3(a,b,c);
    System.out.println("The sum is " + add);
    
    sc.close();
   
  }
   static int sumOf3(int x,int y,int z) {
        int s = x+y+z;
         return s;
  }
      }
 