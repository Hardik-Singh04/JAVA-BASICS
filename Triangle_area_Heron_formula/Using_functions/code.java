import java.util.*;
class trianglefun 
{
    void area(double s1,double s2,double s3)
    {
        double area,S;
        S = (s1 + s2 + s3) / 2;
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
        System.out.format("The Area of triangle = %.2f\n", area);
    }
    public static void main(String[] args) 
    {
        trianglefun obj=new trianglefun ();
        double s1, s2, s3;
        Scanner scanner;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Three Sides of a Triangle");
        s1 = in.nextDouble();
        s2 = in.nextDouble();
        s3 =in.nextDouble();
        obj.area(s1,s2,s3);
 
        
    }
}
