import java.util.*;
class calculate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch,a,b;
        System.out.println("1.Sum\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit\n ");
        System.out.println("Enter your choice :");
        ch=in.nextInt();
        System.out.println("Enter two numbers :");
        a=in.nextInt();
        b=in.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Sum is : "+(a+b));
                break;
            case 2:System.out.println("Subtraction is : "+(a-b));
                break;
            case 3:System.out.println("Multiplication : "+(a*b));
                break;
            case 4:System.out.println("Division : "+(a/b));
                break;
            case 5:System.out.println("Modulus : "+(a%b));
                break;
            default :System.out.println("Wrong Choice.");
                break;
        }
    }
}
