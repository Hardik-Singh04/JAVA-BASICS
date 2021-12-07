import java.util.*;
class pallindrome
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,temp,sum=0,rem;
        System.out.println("Enter number for checking for pallindrome :");
        num=in.nextInt();
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
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
