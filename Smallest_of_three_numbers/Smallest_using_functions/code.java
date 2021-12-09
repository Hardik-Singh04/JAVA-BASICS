import java.util.*;
class smallestfun
{
    int smallest(int a,int b,int c)
    {
        int small=0;   
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
        return small;
    }
    public static void main(String args[])
    {
        smallestfun obj=new smallestfun();
        Scanner in=new Scanner(System.in);
        int a,b,c,small=0;
        System.out.println("Enter three numbers :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        small=obj.smallest(a,b,c);
        System.out.println("Smallest : "+small);
    }
}
