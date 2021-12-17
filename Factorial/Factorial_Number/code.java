import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,fact=1,i;
        System.out.println("Enter number whose factorial is to be found :");
        num=in.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is :"+fact);
     }
}

