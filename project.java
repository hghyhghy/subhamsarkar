
import java.util.Scanner;
public class project
{
 
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int userNumber =0;
         
        do {

            System.out.println("GUESS MY NUMBER(1-100):");
            userNumber= sc.nextInt();

             if (userNumber==myNumber)
             {

                System.out.println("JUST CRACKED ! YOUR GUESS IS CORRECT:");

             break;
             }
             else if(userNumber>myNumber )
             {
                System.out.println("TRY AGAIN! YOUR NUMBER IS LARGER NOW :");

             }
            else if (userNumber<myNumber )
            {
               System.out.println("KEEP IT ON! YOUR NUMBER IS TOO SMALL:");
            }
            
        }
        while (userNumber>=0);
        System.out.print("GOOD TRY ! MY NUMBER WAS:");
        System.out.println(myNumber);
    }
}