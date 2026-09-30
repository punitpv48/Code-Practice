package Practice;

public class Largest_of_four_number {
	public static void main (String [] args )
	{
		int a = 1111;
		int b = 41122;
		int c = 230;
		int d = 200;

		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
					System.out.println("Largest number is a= " + a);
				}
				else
				{
					System.out.println("Largest number is d= " + d);
				}
			}
			else
			{
				if (c>d)
				{
					System.out.println("Largest number is c= " + c);
				}
				else 
				{
					System.out.println("Largest number is d= " + d);
				}
			}
			
		}
		else
		{
			if (b>c)
			{
				if (b>d)
				{
					System.out.println("Largest number is b= " + b);
				}
				else
				{
					System.out.println("Largest number is d= " + d);
				}
			}
			else
			{
				if (c>d)
				{
					System.out.println("Largest number is c= " + c);
				}
				else 
				{
					System.out.println("Largest number is d= " + d);
				}
			}
		}	
		}
}