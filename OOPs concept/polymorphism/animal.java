package polymorphism;

public class animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      animal myAnimal = new animal();  // Create a Animal object
      animal myPig = new Pig();       // Create a Pig object
      animal myDog = new Dog();      // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  } 
    

