
import java.util.*;

public class Collectionqueue
{

  public static void main(String[]args)
  {

       
    //creating a object q1 in an class queue

    Queue<String> q1= new LinkedList<>();

    q1.add("I");

    q1.add("AM");

    q1.add("SUBHAM");

    q1.add("SARKAR");


    System.out.println("the queue is " +  " " + q1);


    //remove a queue


    String front= q1.remove();

    System.out.println("the updated queue is " + " " + front  );

    // add queue

    q1.add("I AM A PASSIONATE CODER");

    //updte queue

    System.out.println("the queue is " + " " + q1);


  // peeked element 

    String temp1= q1.peek();


    //printing the queue

    System.out.println( "the updated queue is " + " " + temp1);


    // storing integer value in a queue


    Queue<Integer> q2= new LinkedList<Integer>();

    //addding integer values to queue


    q2.add(10);

    q2.add(20);

    q2.add(30);

    q2.add(40);

    q2.add(50);
    // creating a loop to print elements as long as the size of the queue

    for(int i=0;i<q2.size();i++)
    {

      System.out.println("the list is " + " "+ q2);


    }


    // getting the size of the queue


    int temp2= q2.size();

    //printing the size of the queue

    System.out.println( "the size of the queue is " + " " + temp2);


  //removing elements 


    System.out.println( q2.remove());

    //retaining all removed item


       q2.retainAll(q2);

     System.out.println("the updated  queue is " + q2);

   //  size pf the queue

    int temp3=   q2.size();

    System.out.println(temp3);

     q2.add(10);
      
     System.out.println(q2);


      q2.peek();

      System.out.println(q2);
    

    

    System.out.println(q2.contains(20));


    for (int i=0; i<q2.size();i++)
    {

      for(int j=0;j<q1.size()-q2.size();j++)
      {
        System.out.println("*");
      }

      System.out.print("*");
    }
    







  }
}