import java.util.*;
public class Collectionstack
{


  public static void main(String[]args)
  {
      // creating an object of class stack

    Stack<Integer> st = new Stack<Integer> ();

    // checking if the stack is empty or not

    boolean result= st.empty();

    //printing the statement

    System.out.println("is the stack empty" + " " + result);


    //pushing element in the stack


    st.push(23);

    st.push(50);

    st.push(100);

    st.push(2000);

    st.push(20);


    



    


    System.out.println("the elements are "+ st);

    result= st.empty();

    System.out.println("is the stack is empty" + " " + result);


    st.pop();

    st.pop();

    System.out.println("the result is "  + " " + st);

  //peek operation to get the head of the stack 
     

    System.out.println("the element at the top of the stack is " + " " + st.peek());

    System.out.println(st);

  







  }


}

OUTPUT:-


is the stack empty true
the elements are [23, 50, 100, 2000, 20]
is the stack is empty false
the result is  [23, 50, 100]
the element at the top of the stack is  100
[23, 50, 100]
