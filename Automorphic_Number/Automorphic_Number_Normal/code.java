import java.util.*;
class automorphic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,sq=0,last=0;
        System.out.println("Enter number to check for automorphic :");
        num=in.nextInt();
        sq=num*num;
        num=num%10;
        last=sq%10;
        if(num==last)
        {
            System.out.println("Automorphic Number.");
        }
        else
        {
            System.out.println("Not Automorphic Number.");
        }
    }
}

