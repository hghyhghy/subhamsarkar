import java.util.Scanner;

public class mainjava{
    
    public static void main(String[] args){
        //how to take input in java
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Input your age:");
        int age=sc.nextInt();

    

        //System.out.println(age);

        //int age =sc.nextInt();
        int votingage=18;

        if(age>=votingage)
        {
            System.out.println("APPLICABE FOR VOTING:");
            
         } else{
            System.out.println("NOT APPLICABLE FOR VOTING:");
        }



    }
}
