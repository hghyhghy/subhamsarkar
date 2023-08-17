

import java.util.*;

public class Change {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NO OF ELEMENT TO BE SEARCHED");

        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<Integer>();


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        

        System.out.println("THE  NUMBER PRESENT ON THAT ELEMENT IS " + list.get(n));

    }

}
