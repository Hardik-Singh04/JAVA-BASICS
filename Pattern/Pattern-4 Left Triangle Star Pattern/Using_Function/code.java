import java.util.*;
class patternfun
{
    void print(int num)
    {
        for(int i=0; i<num; i++)
        { 
            for(int j=2*(num-i); j>=0; j--) 
            {           
                System.out.print(" "); 
            } 
            for(int j=0; j<=i; j++) 
            {   
                System.out.print(" *");
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
