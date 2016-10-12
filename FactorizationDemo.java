/**
   Mohammed Raza
   CSC 236 - Lab4 #1 (main)
*/
import java.util.*;

public class FactorizationDemo
{
	public static void main(String[] args)
	{
		StackClass<Integer> intStack = new StackClass<Integer>(50);

		StackClass<Integer> intStackReverse = new StackClass<Integer>(50);

		try
		{
			intStack.push(29);
			intStack.push(23);
			intStack.push(19);
			intStack.push(17);
			intStack.push(13);
			intStack.push(11);
			intStack.push(7);
			intStack.push(5);
			intStack.push(3);
			intStack.push(2);
		}

		catch (StackOverflowException sofe)
		{
			System.out.println(sofe.toString());
			System.exit(0);
		}

		int num;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("::: Factorization :::");

		System.out.println("\nEnter a number: ");
		num = keyboard.nextInt();

		while(num >= 1)
		{

			if (num % intStack.peek() == 0)
				System.out.print("");

			else
				intStack.pop(); intStackReverse.push(intStack.peek());

			num = num / intStack.peek();
		}

		while(!intStackReverse.isEmptyStack())
		{
			System.out.print(intStackReverse.peek() + " * ");
			intStackReverse.pop();
		}

		System.out.println();
	}
}
