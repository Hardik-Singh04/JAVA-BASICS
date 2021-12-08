import java.util.*;
class factorsfun
{
    void factors(int num)
    {
        int fact=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                fact=i;
                System.out.println(i);
            }
        }
        
    }
    public static void main(String args[])
    {
        factors obj=new factors();
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter number whose factors you want to calculate :");
        num=in.nextInt();
        System.out.println("Factors of "+num+" are :");
        obj.factors(num);
        
        
    }
}
