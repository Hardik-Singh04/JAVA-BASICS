import java.util.*;
class multiply
{
    int multiply(int a,int b)
    {
        int multiply=0;
        multiply=a*b;
        return multiply;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        multiply obj=new multiply();
        int multiply=0;
        int a,b;
        System.out.println("Enter two number for multiplication :");
        a=in.nextInt();
        b=in.nextInt();
        multiply=obj.multiply(a,b);
        System.out.println("Value of multiplication is :"+multiply);
    }
}
