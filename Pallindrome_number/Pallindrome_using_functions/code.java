import java.util.*;
class pallindrome
{
    int pallindrome(int num)
    {
        int temp,sum=0,rem;
        temp=num;
         while(temp!=0)
        {
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        pallindrome obj=new pallindrome();
        Scanner in=new Scanner(System.in);
        int num,sum;
        System.out.println("Enter number for checking for pallindrome :");
        num=in.nextInt();
        sum=obj.pallindrome(num);
        if(num==sum)
        {
        System.out.println("Pallindrome number.");
        }
        else
        {
        System.out.println("Not Pallindrome Number..");
        }
    }
}
