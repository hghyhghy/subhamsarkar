
import java.util.*;


public class Passcode

{




   

   public static void main(String[] args) {


  


    


    Scanner sc= new Scanner(System.in);



    int SystemPasscode=(int)(Math.random()*1000);



    int UserPasscode=0;


    int  MagicNumber= 010;

    String passwordofthesystem = "eDgFTf";


    



    


System.out.println( "enter your MagicNumber");



    UserPasscode= sc.nextInt();



    System.out.println("enter new pin ");



    String setpin= sc.next();




        if (UserPasscode==MagicNumber)

                            {
                              System.out.print("YOUR SystemPasscode is ");
                            }
                            else 
                            {
                              System.out.println("SYSTEM PASSCODE IS" + " " + SystemPasscode);
                              
                              
                              
                            }
                            System.out.println( "the password of the system is " + passwordofthesystem);


                            System.out.println( "the new pin of the sysytem is" + setpin);
                          



    do
    {

        



        UserPasscode= sc.nextInt();
                            



        
        if(UserPasscode==SystemPasscode)
        {

          System.out.println("ACCESS PERMISSION GIVEN!! welcome to DESKTOP 15A2E:");
          
            
          

        }

        else if (UserPasscode!=SystemPasscode)
        {

          System.out.println("ACCESS DENIED! your session has been terminated by internal antivirus:");
          break;

        }


              
      

    }

    while (UserPasscode!=MagicNumber);

     System.out.println("xxxx");


     


     
             
                            




    
  }
  
}