import java.util.Scanner;

public class example19_2_01 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int in_number = scanner.nextInt();
		scanner.close();

		if (in_number % 3 == 0) 
		{
			System.out.printf("The number %d is divisible by 3", in_number);
		}else 
		{
			System.out.printf("The number %d is not divisible by 3", in_number);
		}
	}
}