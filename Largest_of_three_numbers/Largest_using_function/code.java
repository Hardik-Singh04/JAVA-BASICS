import java.util.*;
class largestfun
{
    int largest(int a,int b,int c)
    {
        int max;
         if(a>b&&a>c)
        {
            max=a;
        }
         else if(b>c&&b>a)
        {
            max=b;
        }
        else
        {
            max=c;
        }
        return max;
    }
    public static void main(String args[])
    {
        largestfun obj=new largestfun();
        Scanner in=new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter three numbers :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        max=obj.largest(a,b,c);
        System.out.println("Max : "+max);
    }
}
