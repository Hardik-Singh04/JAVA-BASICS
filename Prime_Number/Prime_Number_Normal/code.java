import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter the number which you wamt to check for prime :");
        num=in.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++)
        {
        if(num%i==0)
        {
            count=1;
            System.out.println("Not prime");
            break;
        }
        }
        if(count==0)
        {
        System.out.println("Prime");
        }
    }
    
}
