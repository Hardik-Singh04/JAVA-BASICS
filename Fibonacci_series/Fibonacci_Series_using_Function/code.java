import java.util.*;
class fibonaccifun
{
    int fibo(int num)
    {
      int i,a=0,b=1,c=0;
      System.out.println(a);
      System.out.println(b);
      for(i=0;i<=num-3;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }  
        return 0;
    }
    public static void main(String args[])
    {
        fibonaccifun obj=new fibonaccifun();
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter number of terms :");
        num=in.nextInt();
        System.out.println("Fibonacci is :");
        obj.fibo(num);
        
        
       
    }
}
