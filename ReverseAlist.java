import java.util.*;

public class ReverseAlist {

    public static void main(String[] args) {

        LinkedList<String> mylist = new LinkedList<String>();

        mylist.add("I");
        mylist.add("AM");
        mylist.add("SUBHAM");
        mylist.add("SARKAR");

        System.out.println(mylist);

        Collections.reverse(mylist);

        System.out.println(mylist);

    }

}