import java.util.*;
class nivenfun
{
    int check(int num)
    {
        int temp=0,rem,sum=0;
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        nivenfun obj=new nivenfun();
        Scanner in=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter the number which you wamt to check for niven number :");
        num=in.nextInt();
        sum=obj.check(num);
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
