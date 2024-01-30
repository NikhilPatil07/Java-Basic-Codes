import java.util.*;

class Patterns
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter last Value : ");

		int num = input.nextInt();

		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.println(" * ");
			}
			System.out.println(" ");
		}
		System.out.println(" Next pattern ");
		
		for(int x = 0; x < num; x++)
		{
			for(int y = 0; y < num; y++)
			{
				System.out.println(" * ");
			}
			System.out.println(" ");
		}
	}
}
