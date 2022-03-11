import java.util.*;
class percent
{
    float calculate(float total_marks,float a,float b,float c,float d,float e)
    {
        float per = ((a+b+c+d+e)/total_marks) * 100;
        return per;  
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        percent ob=new percent();
        System.out.print("Enter the total marks : ");
        float total_marks = in.nextFloat();
        
        System.out.println("Enter the marks of 5 subjects : ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = in.nextFloat();
        float e = in.nextFloat();
        
        float percentage =  ob.calculate(total_marks,a,b,c,d,e);
        System.out.println("Percentage is : "+percentage);

    }
}



