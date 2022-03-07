import java.util.Random;

public class RollingDice 
{
	public static void main(String[] args)
	{
		Random obj = new Random();
		int result = obj.nextInt(6) + 1;
		System.out.println("You rolled : " + result);

	}

}
