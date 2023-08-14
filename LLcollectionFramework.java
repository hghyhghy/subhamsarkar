
import java.util.*;

public class LLcollectionFramework {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("I");
        list.addLast("am");
        list.addLast("SuBhAm");
        list.addLast("SaRkAr");

        System.out.println(list);

        int temp = list.size();
        System.out.println(temp);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.removeFirst();
        list.removeLast();

    }
}