
import java.util.ArrayList;
import java.util.Collections;

public class Array1
{

    public static void main(String[]args)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(9);

        int temp=list.get(2);
        System.out.println(temp);

        list.add(0,2);
        System.out.println(list);
        list.set(0,5);

        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        list.add(0,5);
        System.out.println(list);

        list.add(1,0);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.add(2,1);
        System.out.println(list);
        list.add(3,2);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

             int size=list.size();
             System.out.println(size);

             for(int i=0;i<list.size();i++)
             {
                System.out.print(list.get(i));

             }
                     System.out.println();
                     

                     
                     


                     for(int i=0;i<list.size();i++)
                    {

                          System.out.print("*");

                     }
                     System.out.println();


                    Collections.sort(list);
                     System.out.println(list);




    }
}