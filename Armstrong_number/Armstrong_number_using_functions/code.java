import java.util.*;
class armstrong
{
    int armstrong(int num)
    {
        int temp,sum=0,rem;
        temp=num;
         while(temp!=0)
        {
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        armstrong obj=new armstrong();
        Scanner in=new Scanner(System.in);
        int num,sum;
        System.out.println("Enter number for checking for armstrong :");
        num=in.nextInt();
        sum=obj.armstrong(num);
        if(num==sum)
        {
        System.out.println("Armstrong number.");
        }
        else
        {
        System.out.println("Not Armstrong Number..");
        }
    }
}
