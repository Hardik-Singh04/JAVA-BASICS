import java.util.*;
class factorialfun
{
    int fact(int num)
    {
        int fact=1,i;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        factorialfun obj=new factorialfun();
        Scanner in=new Scanner(System.in);
        int num,fact;
        System.out.println("Enter number whose factorial is to be found :");
        num=in.nextInt();
        fact=obj.fact(num);
        System.out.println("Factorial is :"+fact);
       
    }
}
