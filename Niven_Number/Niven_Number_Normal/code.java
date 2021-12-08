import java.util.*;
class niven
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,temp,rem,sum=0;
        System.out.println("Enter the number which you wamt to check for niven number :");
        num=in.nextInt();
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        if(num%sum==0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not Niven Number");
        }
        
    }
    
}
