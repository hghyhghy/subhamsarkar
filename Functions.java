import java.util.Scanner;
public class Functions
{

   public static  String  printName(String name)
    {

        System.out.println(name);

        return name;

    }
public static int calculateNumber(int a, int b)
{

    int sum=a+b;

    return sum;

}

public static int calculateMultiply(int c, int d)
{
    int Mul=c*d;
    return Mul;
}

public static void printFact(int n)
{

    int fact=1;

    for(int i=n;i>=n-1;i--)
    {
        fact=fact*i;
    }
        System.out.println(fact);
        return;

    
}


    public static void main(String[]args)
    {

        Scanner sc= new Scanner (System.in);

       String name= sc.next();
         String myName=printName(name);

         int a=sc.nextInt();


         int b=sc.nextInt();

         int sum=calculateNumber(a,b);

         System.out.println(sum);

         System.out.print(myName);

         int c= sc.nextInt();

         int d=sc.nextInt();

         int Mul=calculateMultiply(c, d);

         System.out.println(Mul);

         int n=sc.nextInt()
;
printFact(n);





    
        

        
         
    }
}
