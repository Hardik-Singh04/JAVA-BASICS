import java.util.Random;
import java.util.Scanner;

public class RollingDice
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of dice: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Random rand = new Random();
        do 
        {
            System.out.println("The values on dice are: ");
            for(int i=0; i<n; i++)
                System.out.println(rand.nextInt(6)+1);
 
            System.out.println("Continue: true/false");
        }while (in.nextBoolean() == true);
        in.close();
    }
}
