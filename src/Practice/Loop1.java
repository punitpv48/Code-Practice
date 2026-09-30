package Practice;

public class Loop1 {
public static void main (String[] args)
{
	for (int a = 1; a<=10; a++)
	{
		for (int b =10; b>a; b--)
		{
			System.out.print(" ");
		}
		for (int b = 1; b<=a; b++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
	System.out.println("-------------------------------------------------------------------");
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx	
	for (int a = 1; a<= 10; a++)
	{
		for (int b = 1; b<a ; b++)
		{
			System.out.print(" ");
		}
		for (int b = 10; b >= a; b--)
		{
			System.out.print("* ");
		}
		
		System.out.println("");
	}
	
	System.out.println("-------------------------------------------------------------------");
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx		
	for (int a = 1; a<= 7; a++)
	{
		for (int b = 7 ; b>a; b--)
		{
			System.out.print(" ");
		}
		for (int c = 1; c<=a; c++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
	for (int a=1; a <=6; a++)
	{
		for (int b=1; b<=a; b++)
		{
			System.out.print(" ");
		}
		for (int c = 6; c>=a; c--)
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	System.out.println("-------------------------------------------------------------------");
	for (int a =1; a <=7; a++)
	{
		for (int b=6; b>=a; b--)
		{
			System.out.print(" ");
		}
		for (int c=1; c<=a; c++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	for (int a=1; a<=6; a++)
	{
		for (int b = 1; b<=a; b++)
		{
			System.out.print(" ");
		}
		for (int c =6; c>=a; c--)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("-------------------------------------------------------------------");
	//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	
	for (int a=1; a<=7; a++)
	{
			for (int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println("");
	}
	for (int a= 1; a<=6; a++)
	{
		for (int b = 6; b>=a; b--)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
System.out.println("-------------------------------------------------------------------");
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
for (int a=1; a<=10; a++)
{
	for (int b=10; b>=a; b--)
	{
		System.out.print(" ");
	}
	for (int c = 1; c<=a*2-1 ;c++)
	{
			System.out.print("*");
	}
	System.out.println(" ");
}
System.out.println("-------------------------------------------------------------------");
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
for (int i = 1; i<=10; i++)
{
	for (int k = 9; k>=i; k--)
	{
		System.out.print(" ");
	}
	for (int j = 1; j<(i*2); j++)
	{
		System.out.print("*");
	}
	System.out.println("");
}

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

for (int a=1; a<=10; a++)
{
	for (int b = 1; b<a; b++)
	{
		System.out.print(" ");
	}
	for (int c= 1; c<=(21-(a*2)); c++)
	{
		System.out.print("*");
	}
	System.out.println("");
}

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

for (int a= 1; a<=5; a++)
{
	for (int b=4; b>=a; b--)
	{
	System.out.print(" ");	
	}
	for (int c= 1; c<=a; c++)
	{
		System.out.print(c + " ");
	}
	System.out.println("");
}

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

int n = 4; // number of rows
int number = 1;

for (int i = 1; i <= n; i++)                // printing number of rows
    {  
        for (int j = n; j > i; j--)         // printing spaces 
        {
        System.out.print(" ");
        }
    
    for (int k = 1; k <= i; k++)            // printing numbers
        {
        System.out.print(number + " ");
        number++;
        }
    System.out.println();                   // new line after each row
}

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

int nx = 9; // number of rows
int numberx = 1;

for (int i = 1; i <= nx; i++)                // printing number of rows
    {  
        for (int j = nx; j > i; j--)         // printing spaces 
        {
        System.out.print(" ");
        }
    
    for (int k = 1; k <= i; k++)            // printing numbers
        {
        System.out.print(numberx + " ");
        }
    numberx++;
    System.out.println();                   // new line after each row
}

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
int o = 15;                                   // height of the diamond


for (int i = 1; i <= o; i++)                  // upper half of the diamond
{
    for (int j = o; j > i; j--)              // printing spaces
    {
        System.out.print(" ");
    }
   
    System.out.print("&");                  // printing first '&'
    
    if (i > 1) 
    {
    for (int j = 1; j < 2 * (i - 1); j++)    // printing spaces or '&'
    {
            System.out.print(" ");
    }
        System.out.print("&");
    }
    
    System.out.println();                     // new line after each row
}


for (int i = o - 1; i >= 1; i--)              // lower half of the diamond
    {
    
    for (int j = o; j > i; j--)               // printing spaces
    {
        System.out.print(" ");
    }

    System.out.print("&");                   // printing first '&'
    
    if (i > 1)                               // printing spaces or '&'
    {
        for (int j = 1; j < 2 * (i - 1); j++) 
        {
            System.out.print(" ");
        }
        System.out.print("&");
    }
    
    System.out.println();                    // new line after each row
}

}
}
