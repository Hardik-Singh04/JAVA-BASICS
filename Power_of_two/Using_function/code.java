import java.util.*;
class calculatefun
{
    void calc(int num)
    {
        while(num!=1)
        {
            if(num%2==0)
            {
                num=num/2;
            }
            else
            {
                System.out.println("Not power of 2");
                break;
            }
        }
        if(num==1)
        {
            System.out.println("Power of 2");
        }
    }
    public static void main(String args[])
    {
        calculatefun obj=new calculatefun();
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num=in.nextInt();
        obj.calc(num);
    }
}
