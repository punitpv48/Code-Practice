package Practice;

public class Array1 {
	public static void main(String[] args) {

int a [] = {1,2,3,4,5,6};
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
System.out.println(a[5]);

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	
int b [] = new int [6];

b [0] = 1;
b [1] = 2;
b [2] = 3;
b [3] = 4;
b [4] = 5;
b [5] = 6;
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
System.out.println(b[5]);

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

int c [] = {1,2,3,4,5,6,7,8,9};            // printing the array

for (int z=0; z< c.length; z++)
{
	System.out.print(c[z] + ", ");
}

System.out.println("");
System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

int d [] = {1,2,3,4,5,6,7,8,9};              // addition in all array index

for (int z = 0; z< d.length ; z++)
{
	d[z] = d [z] + 5;
	
}

for (int y = 0; y< d.length ; y++)
{
	System.out.print(d[y] + ", ");
}

System.out.println("");
System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

int e [] = {1,2,3,4,5,6,7,8,9};                // printing in reverse order
System.out.println(e.length);
for (int z= e.length-1; z>=0; z--)
{
	System.out.print(e[z]);
	if (z>0)
	{
		System.out.print(", ");
	}
	else
	{
		System.out.print(".");
	}
}

System.out.println("");
System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

int f [] = {1,2,3,4,5,6,7,8,9};                      // reversing the array index value
System.out.println("Initial order");

for (int z=0; z<=f.length-1; z++)
{
	System.out.print(f[z]);
	if (z<f.length-1)
	{
		System.out.print(", ");
	}
	else
	{
		System.out.print(".");
	}
}

int g []= new int [f.length];

for (int z=0; z<=f.length-1; z++)
{
	g [z] = f [(f.length-1)-z];
}

f = g;

System.out.println();
System.out.println("Reverse order");
for (int z=0; z<=f.length-1; z++)
{
	System.out.print(f[z]);
	if (z<f.length-1)
	{
		System.out.print(", ");
	}
	else
	{
		System.out.print(".");
	}
}

System.out.println("");
System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");


	}

}
