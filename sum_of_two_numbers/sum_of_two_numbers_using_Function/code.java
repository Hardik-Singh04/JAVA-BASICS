import java.util.*;
class sum
{
    int add(int a,int b)
    {
        int sum=0;
        sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        sum obj=new sum();
        int addition=0;
        int a,b;
        System.out.println("Enter two number for addition :");
        a=in.nextInt();
        b=in.nextInt();
        addition=obj.add(a,b);
        System.out.println("Value of sum is :"+addition);
    }
}
