import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// strings are immutable in nature
// the original string never gets changend 


        System.out.println("Hello World!!");

// literal  Strings get stored in string pool 

        String name = "purva";

//  string can also be made as below but
        String a = new String("purva");
        System.out.println(a);

    // methods of string
    String ab = "nothing";

    System.out.println(ab.toLowerCase()); //this make new string of the ab string which contain lowercases
    System.out.println(ab.toUpperCase()); //this make new string of the ab string which contain uppercases
    System.out.println(ab.charAt(0)); //this give char value tht present at index
    System.out.println(ab.contains("g")); //this give boolean value whether string contain this or not
    System.out.println(ab.startsWith("no")); //this give boolean value whether string starts with this or not
    System.out.println(ab.endsWith("ing")); //this give boolean value whether string ends with this or not
    System.out.println(ab.equals(a)); //this checks if two strings are equal 
    System.out.println(ab.equalsIgnoreCase(a)); //this checks if two strings are equal ignoring cases
    System.out.println(ab.trim()); //this removes the spaces given to the string
    System.out.println(ab.replace("o", "p")); //this replaces the first thing with another one
   
    String s ="     ";
    if (s.isEmpty()) {
        System.out.println("Empty..");
    } else if (s.isBlank()) {
        System.out.println("Blank..");
    }
    else {
        System.out.println("This string is not empty not blank....");
    }
   
    String m[] =ab.split("t");  //this splits the string
    for (String string : m) {
        System.out.println(string);
    }
    
    char ch[] = ab.toCharArray();   //this converts string to the character array
    for (char c : ch){
        System.out.println(c);
    }
    
    System.out.println(ab.substring(2,5)); //this give substring from string where fiest index is inclusive and second is exclusive
    // System.out.println(ab.valueOf(0)); //



// small program to check given comment contains spam 
//     System.out.println("Enter your comment here:");
//     String comment = sc.nextLine();

//     if (comment.toLowerCase().contains("buy now") || comment.toLowerCase().contains("you win")  ){
//         System.out.println("spam");
//     }
//     else{
//         System.out.println("safe");
//     }
    
    sc.close();

    }
}
