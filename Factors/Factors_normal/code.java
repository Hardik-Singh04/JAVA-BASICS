import java.util.*;
class factors
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,fact=0;
        System.out.println("Enter number whose factors you want to calculate :");
        num=in.nextInt();
        System.out.println("Factors of "+num+" are :");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                fact=i;
                System.out.println(i);
            }
        }
    }
}
