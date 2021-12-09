import java.util.*;
class smallest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,small;
        System.out.println("Enter three numbers :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a<b&&a<c)
        {
            small=a;
        }
        else if(b<c&&b<a)
        {
            small=b;
        }
        else
        {
            small=c;
        }
        System.out.println("Small : "+small);
    }
}
