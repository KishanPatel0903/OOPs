package Encapsulation;
class animal {
    // private field 
    private int age;
    //getter method 
    public int getage ( ) {
    return age;
    }
    //setter method 
    public void setAge ( int age ) {
    this. age = age;
    }
    }
    class Main {
    public static void main (String args []){
    //create an object of person 
    animal a1= new animal ();
    //change age using setter 
    a1. setAge (12);
    // access age using getter 
    System.out.println("animal age is " + a1. getage ( ) );
    }
}