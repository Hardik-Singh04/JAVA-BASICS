import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i=0,a=0,b=1,c=0;
        System.out.println("Enter limit :");
        num=in.nextInt();
        System.out.println("Fibonacci is :");
        System.out.println(a);
        System.out.println(b);
        while(c!=num)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        
       
    }
}
