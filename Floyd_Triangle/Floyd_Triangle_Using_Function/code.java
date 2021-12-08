import java.util.*;
class floydfun
{
    int floyd(int num)
    {
        int k=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[])
    {
        floydfun obj=new floydfun();
        Scanner in=new Scanner(System.in);
        int num,fact=0,k=1;
        System.out.println("Enter number of rows in floyd triangle :");
        num=in.nextInt();
        System.out.println("Floyd Triangle :");
        obj.floyd(num);
    }
}
