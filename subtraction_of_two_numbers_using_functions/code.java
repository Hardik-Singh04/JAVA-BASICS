import java.util.*;
class subtract
{
    int subtract(int a,int b)
    {
        int diff=0;
        diff=a-b;
        return diff;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        subtract obj=new subtract();
        int diff=0;
        int a,b;
        System.out.println("Enter two number for subtraction :");
        a=in.nextInt();
        b=in.nextInt();
        diff=obj.subtract(a,b);
        System.out.println("Value of differnce is :"+diff);
    }
}
