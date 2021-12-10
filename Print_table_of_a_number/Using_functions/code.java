import java.util.*;
class tablefun
{
    void calc(int num)
    {
        System.out.println("Table is :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
    public static void main(String args[])
    {
        tablefun obj=new tablefun();
        Scanner in=new Scanner(System.in);
        int num,i;
        System.out.println("Enter your choice :");
        num=in.nextInt();
        obj.calc(num);
       
    }
}
