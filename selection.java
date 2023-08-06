
public class selection
{
    public static void printArray(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }

        System.out.println();


    }



    public static void main(String[]args)
    {
        int arr[]={9,1,7,8,6,4,2};

        for(int i=0;i<arr.length-1;i++)
        {
                  int small=i;

                  for(int j=i+1;j<arr.length;j++)
                  {

                    if(arr[small]>arr[j])
                    {
                         small=j;


                    }
                }
                  

                
                

                   int temp=arr[small];

                  arr[small]=arr[i];

                  arr[i]= temp;

       
        }

            printArray(arr);
    }




    
}
