import java.util.*;
class patternfun
{
    void print(int num)
    {
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
    public static void main(String args[])
    {
        patternfun obj=new patternfun();
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter number of rows :");
        num=in.nextInt();
        obj.print(num);    
    }
}
