import java.util.Scanner;

public class example19_09
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input name: ");
		String name = in.nextLine();
		
		System.out.print("Input age: ");
		int age = in.nextInt();
		
		System.out.printf("Name: %s, Age: %d\n", name, age);
		in.close();
	}
}