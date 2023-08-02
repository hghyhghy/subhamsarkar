import java.util.Scanner;
public class rate{
     public static void main(String[]args)
     {
        Scanner sc= new Scanner(System.in);

    
        System.out.println("myPrice");
        int myPrice= sc.nextInt();

        int LR=500;
        //lR= lowest rate
          if(myPrice<LR)
          {
            System.out.println("NO AVAILABLE ITEM:");

          }
          else
          if(myPrice==LR)
          {
            System.out.println("ITEMS ARE AVAILABLE:");

          }

          else
          if(myPrice>=LR)
          {
            System.out.println("YOU CAN BUY MORE THAN ONE ITEM:");
          }
          
int airdopesPrice= 2000;

System.out.println("myBalance:");
int myBalance= sc.nextInt();

if(myBalance>=airdopesPrice)
{
    System.out.println(" YOUR TRANSACTION IS SUCCESSFULLY COMPLETED:");

}
else if(myBalance !=airdopesPrice)
{
    System.out.println("NOT SUFFICIENT BALANCE:");
}



     }
}