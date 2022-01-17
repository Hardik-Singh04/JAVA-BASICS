import java.util.*;
class duck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,rem,count=0;
        System.out.println("Enter number to check for Duck Number :");
        num=in.nextInt();
        while(num>0)
        {
            rem=num%10;
            if(rem==0)
            {
                count=1;
            }
            num=num/10;
        }
        
        if(count==1)
        {
            System.out.println("Duck Number.");
        }
        else
        {
            System.out.println("Not Duck Number.");
        }
    }
}


