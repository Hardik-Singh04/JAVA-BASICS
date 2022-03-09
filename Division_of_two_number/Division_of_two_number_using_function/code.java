import java.util.*;
class divide
{
    int divide(int a,int b)
    {
        int divide=0;
        divide=a/b;
        return divide;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        divide obj=new divide();
        int divide=0;
        int a,b;
        System.out.println("Enter two number for division :");
        a=in.nextInt();
        b=in.nextInt();
        divide=obj.divide(a,b);
        System.out.println("Value of division is :"+divide);
    }
}
