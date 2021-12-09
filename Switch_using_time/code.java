import java.util.*;
class information
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch;
        System.out.println("1.Day\n2.Date\n3.Month\n4.Year\n5.Exit\n ");
        System.out.println("Enter your choice :");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Day : Thursday");
                break;
            case 2:System.out.println("Date : 09");
                break;
            case 3:System.out.println("Month : December");
                break;
            case 4:System.out.println("Year : 2021");
                break;
            default :System.out.println("Wrong Choice.");
                break;
        }
    }
}
