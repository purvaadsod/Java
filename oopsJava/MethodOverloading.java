// package oopsJava;


public class MethodOverloading {

    public static void main(String[] args) {
        Greet obj1 = new Greet();
        obj1.greetings();
        obj1.greetings("Purva");
        obj1.greetings("Purva",2);
    }
}
class Greet {

    // method overloding is when we define methods with same name but different datatypes of parameters or different numbers og parametres 
    //we cannot say method overloading if the return type is different ,there must be difference in the number of parameters or type of parametres
    void greetings() {
        System.out.println("Hello , Good Morning!!");
    }

    void greetings(String name) {
        System.out.println("Hello " + name +  ", Good Morning!!");
    }

    void greetings(String name,int count) {
        for (int i = 0; i <count; i++) {

            System.out.println("Hello " + name +  ", Good Morning!!");
        }
     }

}