import java.util.*;
class subtract
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int diff=0;
        int a,b;
        System.out.println("Enter two number for subtraction :");
        a=in.nextInt();
        b=in.nextInt();
        diff=a-b;
        System.out.println("Value of difference is :"+diff);
    }
}
