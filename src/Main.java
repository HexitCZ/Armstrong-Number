import java.util.ArrayList;
import java.lang.Math;

public class Main
{

	private static void ArmstrongNum(int num)
	{
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int number = num;
		do
		{
			digits.add(num % 10);
			num /= 10;
		} while (num > 0);
		boolean tempBool = true;
		int tempInt = 0;
		for (int i = 0; i < digits.size(); i++)
		{
			tempInt += Math.pow(digits.get(i), 3);

		}
		if (tempInt == number)
			System.out.println("It is Armstrong number");
		else
			System.out.println("It is not Armstrong number");

	}

	public static void main(String[] args)
	{
		ArmstrongNum(0);

	}

}
