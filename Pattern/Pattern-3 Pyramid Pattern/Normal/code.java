import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter number of rows :");
        num=in.nextInt();  
        for (int i=0; i<num; i++) 
        { 
            for (int j=num-i; j>1; j--) 
            { 
                System.out.print(" "); 
            }  
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* ");
            } 
            System.out.println(); 
        } 
    }  
}
