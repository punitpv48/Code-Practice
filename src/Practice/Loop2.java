package Practice;

public class Loop2 {
	public static void main(String[] args) {
		int n = 15;            // no of line

		for (int a=1; a<=n; a++)
		{
			for (int b = 1; b<=n-a; b++)   // first space 
			{
				System.out.print(" ");
			}
			System.out.print("&");        // first &
			
			if (a>1)                      // to start from a=2 value
			{
				for (int c =1; c<2*(a-1); c++)     //2,4,6,8,....... <1,3,5,7.....<=2,4,6,8
				{
					System.out.print(" ");
				}
				System.out.print("&");        // second &
			}
			System.out.println("");         // for printing in next line
		}
		for (int a= 1; a<=n-1; a++)         // bottom triangle
		{
			for (int b= 1; b<=a; b++)       // bottom first space
			{
				System.out.print(" ");
			}
			System.out.print("&");          // bottom first &
			if (a<n-1)                      // space should not be printed at value a=14.
			{
				for ( int c= 1; c<2*(n-a)-2; c++)    // 
				{
					System.out.print(" ");   // bottom mid space
				}
				System.out.print("&");       // bottom second &
			}
			System.out.println("");          // print next line
		} 
	}

}
