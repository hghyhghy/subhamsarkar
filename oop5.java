

abstract class Animal{
   abstract void walk();
}
 class Horse extends Animal{

    public void walk()
    {

        System.out.println("runs on 4 legs:");

    }
 }
 class Chicken extends Animal{
    public void walk(){

        System.out.println("walks on 2 legs:");

    }
 }
 public class oop5{
     public static void main(String[]args)
     {
        Horse horse= new Horse();
        horse.walk();
//interface

interface Animal {
   public void walk();

}
interface Herbivore{
}

class Horse implements Animal,Herbivore{

   public void walk()
    {
        System.out.println("walks on 4 legs:");
    }
}
     }
 }
