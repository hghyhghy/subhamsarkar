import java.util.Scanner;
public class loop{
    
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);

        int age= sc.nextInt();

   for(int i=0;i<=1;i++){

       System.out.println("CHILDHOOD:");

   }

    int j=20;
    while (j>=1){

        j=j-1;

        System.out.println(j);

  }

    int k=23;
    do{
        System.out.println(k);
        k=k-1;
    }
    
    while(k>=1);
    

    }
}