package Practice;

public class Array2 {
	public static void main(String[] args) {
		
// Reverse the array type-I
		
int a [] = {1,2,3,4,5,6,7,8,9,10};

System.out.println("Original Order by using Type-I");

for (int x=0; x<a.length;x++)
{
	System.out.print(a[x]);
	
	if (x==a.length-1)
	{
		System.out.print(".");
	}
	else
	{
		System.out.print(",");
	}
	
}
System.out.println("");
System.out.println("Reverse Order by using Type-I");

int b [] = new int [a.length];

for (int x=0; x<a.length;x++)
{
	b[x] = a[(a.length-1)-x];
}

a=b;
for (int x=0; x<a.length;x++)
{
	System.out.print(a[x]);
	
	if (x==a.length-1)
	{
		System.out.print(".");
	}
	else
	{
		System.out.print(",");
	}
	
}
System.out.println("");
System.out.println("------------------------------------------------------------------------------");

//Reverse the array type-II

int c [] = {1,2,3,4,5,6,7,8,9,10};

System.out.println("Original Order by using Type-II");

for (int x=0; x<c.length;x++)
{
	System.out.print(c[x]);
	
	if (x==c.length-1)
	{
		System.out.print(".");
	}
	else
	{
		System.out.print(",");
	}
	
}
System.out.println("");
System.out.println("Reverse Order by using Type-II");

for (int x=0; x<c.length/2;x++)
{
	int y = c[x];
	c[x] = c[(c.length-1)-x];
	c[(c.length-1)-x] = y;
}

for (int x=0; x<c.length;x++)
{
	System.out.print(c[x]);
	
	if (x==c.length-1)
	{
		System.out.print(".");
	}
	else
	{
		System.out.print(",");
	}
	
}
System.out.println("");
System.out.println("------------------------------------------------------------------------------");


	
	}
}
