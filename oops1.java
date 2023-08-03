
class Pen{
     String color;
     String type;
     
 public void write()
 {
 

  System.out.println("WRITE SOMETHING:");
  
 }
 public void printColor(){

    System.out.println(this.color);
 }
}
 class Student{
  
    String name;
      int age;
       int rollno;
         String standard;

       public void printInfo()
       {

        System.out.println(this.name);
         System.out.println(this.age);
          System.out.println(this.rollno);
           System.out.println(this.standard);

       }
       Student(Student s2)
       {
        this.name=s2.name;
        this.age=s2.age;
        
       }

 }

public class oops1{

    public static void main(String[]args){
         Pen pen1= new Pen();
    pen1.color="blue";
    pen1.type="ballpoint";
     Pen pen2= new Pen();
     pen2.color="black";
     pen2.type="gel";

     pen1.write();
     pen2.write();

     pen1.printColor();
     pen2.printColor();

   Student s1= new Student();
     s1.name="SUBHAM SARKAR";
      s1.age= 20;
       s1.rollno=03;
        s1.standard="third year Btech";



s1.printInfo();

}

}