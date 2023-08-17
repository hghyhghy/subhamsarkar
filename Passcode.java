
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




OUTPUT (1)

enter your MagicNumber
010
enter new pin
123456
SYSTEM PASSCODE IS 711
the password of the system is eDgFTf
the new pin of the sysytem is123456
711
ACCESS PERMISSION GIVEN!! welcome to DESKTOP 15A2E:


OUTPUT(2)


enter your MagicNumber
010
enter new pin
12345  
SYSTEM PASSCODE IS 893
the password of the system is eDgFTf
the new pin of the sysytem is12345
894
ACCESS DENIED! your session has been terminated by internal antivirus:
xxxx



   
   
   
