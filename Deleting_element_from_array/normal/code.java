import java.util.*;
class delete
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,size;
        System.out.println("Enter size of array :");
        size=in.nextInt();
        System.out.println("Enter element to be deleted :");
        num=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements :");
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i]==num)
            {
                for(int j=i;j<size-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                size--;
            }
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i]==num)
            {
                for(int j=i;j<size-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                size--;
            }
        }
        if(size==0)
        {
            System.out.println("Array is empty :");
        }
        else
        {
        System.out.println("Elements after deleting element :");
         for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        }
    }
}
