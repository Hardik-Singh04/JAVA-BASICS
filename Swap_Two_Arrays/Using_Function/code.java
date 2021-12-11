import java.util.*;
class swap
{
    void calc(int arr[],int arr1[],int temp[],int size)
    {
        for(int i=0;i<size;i++)
        {
            temp[i]=arr[i];
            arr[i]=arr1[i];
            arr1[i]=temp[i];
            
        }
        System.out.println("Array 1  :");
         for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Array 2  :");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr1[i]);
        }
    }
    public static void main(String args[])
    {
        swap obj=new swap();
        Scanner in=new Scanner(System.in);
        int num,size;
        System.out.println("Enter size of array :");
        size=in.nextInt();
        int arr[]=new int[size];
        int arr1[]=new int[size];
        int temp[]=new int[size];
        System.out.println("Enter elements :");
        System.out.println("Array 1  :");
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array 2  :");
        for(int i=0;i<size;i++)
        {
            arr1[i]=in.nextInt();
        }
        
        obj.calc(arr,arr1,temp,size);
    }
}
