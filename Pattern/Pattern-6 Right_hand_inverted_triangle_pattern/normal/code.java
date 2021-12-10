import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter number of rows :");
        num=in.nextInt();  
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=num;j++)
            {
                 if((i+j)>=num)
                {
                     System.out.print(" ");
                }
                 else
                {
                     System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}

