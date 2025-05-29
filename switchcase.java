import java.util.Scanner;

public class switchcase {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your favourite fruit between following seven:");
      System.out.println("Apple,Grapes,Mango,Banana,Watermelon,Guava");
      
      String fruit=sc.next();
      switch (fruit.toLowerCase()){
         case "apple":
                System.out.println("Apple is red");
                  break;
         case "grapes":
                System.out.println("Grape are green");
                 break;
         case "mango":
                 System.out.println("Mango is yellow");
                   break;
         case "banana":
                 System.out.println("Banana is yellow");
                  break;
         case "watermelon":
                  System.out.println("Wtermelon is very hydrating fruit");
                    break;
         case "guava":
                  System.out.println("Guava is good");
                   break;
         default : 
                  System.out.println("Entered wrong fruit");
      }

        sc.close();
     }
    
}