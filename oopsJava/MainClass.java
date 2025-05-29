//  package oopsJava;   //if uncomment this line here some error( ) occurs so know about it

public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();
        // ctr+click
       
        Dog d2 = new Dog();
        d2.name = "Loe";
        d2.walk();

    }

}

// class is created in MetaSpace maybe  
class Dog {
    String name;
    String color;
    int age;

    void walk(){
        // System.out.println("Dog is walking..");
    // here name variable is assigned in main class so i can use it here
        System.out.println(name + " is walking..");
    }
   
    void bark(){
        // System.out.println("Dog is barking..");
        System.out.println(name + " is barking..");

    }
    
}



