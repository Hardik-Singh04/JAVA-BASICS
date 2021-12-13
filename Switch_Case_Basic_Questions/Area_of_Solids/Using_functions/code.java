import java.util.*;
class calculatefun
{
    void circle(int a)
    {
                System.out.println("Area of circle : "+(a*a*3.14));           
    }
    void rect(int a,int b)
    {
                System.out.println("Area of rectangle: "+(a*b));
    }
    void sq(int a)
    {
                System.out.println("Area of Square : "+(a*a));
    }
    public static void main(String args[])
    {
        calculatefun obj=new calculatefun();
        Scanner in=new Scanner(System.in);
        int ch,a=0,b=0;
        System.out.println("1.Circle\n2.Rectangle\n3.Square\n4.Exit\n ");
        System.out.println("Enter your choice :");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter radius of circle :");
                a=in.nextInt();
                obj.circle(a);
                break;
            case 2:System.out.println("Enter two sides of rectangle :");
                a=in.nextInt();
                b=in.nextInt();
                obj.rect(a,b);
                break;
            case 3:System.out.println("Enter sides of square :");
                a=in.nextInt();
                obj.sq(a);
                break;
            default :System.out.println("Wrong Choice.");
                break;
        }
    }
}
