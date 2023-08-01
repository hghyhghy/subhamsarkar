
import java.util.Scanner;
public class topper
{
    public static void main(String[]args)
    {

        Scanner sc= new Scanner(System.in);

        String subject1="MATHS";
        String subject2="PHYSICS";
        String subject3="ENGLISH";
        String subject4="BENGALI";
        String subject5="COMPUTER SCIENCE";


        int marks1= sc.nextInt();
        int marks2= sc.nextInt();
        int marks3= sc.nextInt();
        int marks4= sc.nextInt();
        int marks5= sc.nextInt();

if(marks1>50&&marks1<70)
{

    System.out.println("PASSED IN MATHS WITH GRADE E:");

}

if(marks1>71&&marks1<100)
{

                      System.out.println("PASSED IN MATHS WITH GRADE O:");
}
 else
 {
    if (marks1<40)
    {
                      System.out.println("FAILED IN MATHS.NO GRADE IS OFFERED");
    }
 }


 int marks2 = sc.nextInt();

 
             if (marks2>71&&marks2<100)
 {
                     System.out.println("PASSED IN PHYSICS WITH GRADE O");
 }

 if(marks2>50&&marks2<70)
 {
                     System.out.println("PASSED IN PHYSICS WITH GRADE E");

 }
 else{
    if (marks2<40)
    {
                    System.out.println("FAILED IN PHYSICS .NO GRADE IS OFFERED");
    }
 }
    }
}
