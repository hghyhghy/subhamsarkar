import java.util.Scanner;

public class operation
{
    public static void main(String[]args)
    {

        
        Scanner sc = new Scanner(System.in);
        
        int cash= sc.nextInt();

        if( cash<=10)
        {

            System.out.println("CHAL HAT BEHEN KI LAUDI:");
            
        }

        if(cash>10&&cash<50)
        {
            System.out.println("CAN BUY ONE THING:");

        }

            else
            {
                if(cash>=50)
                System.out.println("CAN BUY TWO THINGS:");
            }
        
    }
}
