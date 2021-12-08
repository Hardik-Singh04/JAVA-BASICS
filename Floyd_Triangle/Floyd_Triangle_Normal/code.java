import java.util.*;
class floyd
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,fact=0,k=1;
        System.out.println("Enter number of rows in floyd triangle :");
        num=in.nextInt();
        System.out.println("Floyd Triangle :");
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }
    }
}
