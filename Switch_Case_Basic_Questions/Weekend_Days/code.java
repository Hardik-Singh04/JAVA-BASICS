import java.util.*;
class DAYNAME
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch;
        System.out.println("Enter choice according to Days of weekend from Monday :");
        ch=in.nextInt();
        switch (ch)
        {
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;
            
            case 7:
            System.out.println("Sunday");
            break;
            
            default:
            System.out.println("Incorrect day.");
        }
    }
}
