import java.util.*;
class tribonaccifun
{
    void tri(int a,int b,int c,int num)
    {
        int sum=a+b+c;
        int count=3;
          while(count!=num)
        {
            System.out.print(sum+" "); 
            a=b;
            b=c;
            c=sum;
            sum=a+b+c;  
            count++;
        }
    }
    public static void main(String args[])
    {
        tribonaccifun obj=new tribonaccifun();
        Scanner in=new Scanner(System.in);
        int num,i,a=0,b=0,c=1,sum=0;
        System.out.println();
        System.out.println("Enter number of terms :");
        num=in.nextInt();
        System.out.println("Tribonacci is :");
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        obj.tri(a,b,c,num);
    }
}
