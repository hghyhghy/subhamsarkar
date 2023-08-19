import java.util.*;

class Person
{

  String name;

  int age;

  int height;

  String address;

  String passion;



  public void getName()
  {

    System.out.println(this.name);

  }

  public void getAge()
  {

    System.out.println(this.age);

  }

  public void getHeight()
  {

    System.out.println(this.height);

  }

  public void getAddress()
  {

    System.out.println(this.address);
  }

  public void getPassion()
  {
  

  System.out.println(this.passion);
  }

  
}


public class Ps4
{

  public static void main(String[] args)
  {
    
      //creating an object person1 and person 2 in class person 

    Person person1= new Person();

    Person person2= new Person();



    person1.name="SUBHAM SARKAR";

    person1.age= 20;

    person1.address="KOLKATA";

    person1.passion="SDE";

     
    person2.name="SHREYOSHI SAHA ";

    person2.age=19;

    person2.address= "KOLKATA";

    person2.passion="ARCHITECT";





    

    person1.getName();

    person1.getAge();

    person1.getAddress();

    person1.getPassion();



    person2.getName();

    person2.getAge();

    person2.getAddress();

    person2.getPassion();


    
  }
}