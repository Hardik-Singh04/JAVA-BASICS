import java.util.*;
class tribonacci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i,a=0,b=0,c=1,sum=0,count=3;
        System.out.println();
        System.out.println("Enter number of terms :");
        num=in.nextInt();
        System.out.println("Tribonacci is :");
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        sum=a+b+c;
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
}
