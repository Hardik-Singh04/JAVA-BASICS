import java.util.*;
class table
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i;
        System.out.println("Enter your choice :");
        num=in.nextInt();
        System.out.println("Table is :");
        for(i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
       
    }
}
