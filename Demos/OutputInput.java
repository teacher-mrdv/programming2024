// input and output demo with pure Java ALTERNATIVES
import java.util.Scanner;

public class OutputInput
{
	
	public static void main (String[] args)
	{
		IBIO.output("Hello");
		IBIO.output("CS");
		IBIO.output("World");
		IBIO.out("Hello");
		IBIO.out("CS");
		IBIO.output("World");

		String name = IBIO.input("What's your name? ");
		int age = IBIO.inputInt("What's your age? ");
		IBIO.out("Hello, ");
		IBIO.output(name);
		IBIO.out("So you are ");
		IBIO.out(age);
		IBIO.output(" years old?");
		IBIO.out("You are ");
		if(age < 18)
		{	IBIO.out("a minor");
		} else {
			IBIO.out("an adult");
		}
		IBIO.output(", then.");
		IBIO.output("Bye!");

		System.out.println("\n\n");
		System.out.println("Hello");
		System.out.println("CS");
		System.out.println("World");
		System.out.print("Hello");
		System.out.print("CS");
		System.out.println("World");
		Scanner input = new Scanner(System.in);
		System.out.print("Input your name ");
		name = input.nextLine(); // for Strings
		System.out.print("Input your age ");
		age = input.nextInt();	// for integers
		System.out.print("Hello, ");
		System.out.println(name);
		System.out.print("So you are ");
		System.out.print(age);
		System.out.println(" years old?");
		System.out.print("You are ");
		if(age < 18)
		{	System.out.print("a minor");
		} else {
			System.out.print("an adult");
		}
		System.out.println(", then.");
		System.out.println("Bye!");
	}
}

