

//Abstract class Animal with abstract method sound()
abstract class Animal {
 // Abstract method sound() to be implemented by subclasses
 public abstract void sound();

 // Concrete method eat()
 public void eat() {
     System.out.println("Animal is eating.");
 }

 // Concrete method sleep()
 public void sleep() {
     System.out.println("Animal is sleeping.");
 }
}

//Dog class extends Animal and provides implementation for sound()
class Dog extends Animal {
 // Implementation of the abstract sound() method
 @Override
 public void sound() {
     System.out.println("Dog makes: Woof");
 }
}

//Cat class extends Animal and provides implementation for sound()
class Cat extends Animal {
 // Implementation of the abstract sound() method
 @Override
 public void sound() {
     System.out.println("Cat makes: Meow");
 }
}

public class AnimalHierarchy {
 public static void main(String[] args) {
     // Using polymorphism to refer to Animal objects as Animal types
     Animal myDog = new Dog(); // Dog object referenced by Animal type
     Animal myCat = new Cat(); // Cat object referenced by Animal type

     // Call sound() method on Dog
     System.out.print("Call sound() method on Dog: ");
     myDog.sound(); // Output: Dog makes: Woof

     // Call sound() method on Cat
     System.out.print("Call sound() method on Cat: ");
     myCat.sound(); // Output: Cat makes: Meow

     // Call common methods inherited from Animal class
     myDog.eat(); // Output: Animal is eating.
     myCat.sleep(); // Output: Animal is sleeping.
 }
}
