

public class Type
{

    public static void main(String[]args)
    {


        int n=5;
        int m=6;

          for( int i=n;i>=1;i--)
          {

            for(int j=m;j>=m-i;j--)
            {

             System.out.print("0");

            }
          
          System.out.println();
        }
          

        for(int i=n;i>=1;i--)
        {
            for(int j=m;j>=i;j--)
            {
                System.out.print("0");
            }
            System.out.println();
        }
    }

}



OUTPUT:







000000
00000
0000
000
00
00
000
0000
00000
000000
