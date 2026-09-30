package Practice;

public class Practice {

public static void main(String[] args) {

int n = 15;

for (int a=1; a<=n; a++)
{
	for (int b = 1; b<=n-a; b++)
	{
		System.out.print(" ");
	}
	System.out.print("&");
	
	if (a>1)
	{
		for (int c =1; c<2*(a-1); c++)
		{
			System.out.print(" ");
		}
		System.out.print("&");
	}
	System.out.println("");
}
for (int a= n-1; a>=1; a--)
{
	for (int b= n; b>a; b--)
	{
		System.out.print(" ");
	}
	System.out.print("&");
	
	if (a>1)
	{
		for ( int c= 1; c<2*(a-1); c++)
		{
			System.out.print(" ");
		}
		System.out.print("&");
	}
	System.out.println("");
}


}
}
