import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter three numbers :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
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
        System.out.println("Max : "+max);
    }
}
