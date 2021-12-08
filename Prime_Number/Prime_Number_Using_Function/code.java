import java.util.*;
class primefun
{
    int prime(int num)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
        if(num%i==0)
        {
            count=1;
            System.out.println("Not prime");
            break;
        }
        } 
        return count;
    }
    public static void main(String args[])
    {
        primefun obj=new primefun();
        Scanner in=new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter the number which you wamt to check for prime :");
        num=in.nextInt();
        count=obj.prime(num);
        if(count==0)
        {
        System.out.println("Prime");
        }
    }
    
}
