package Practice;

public class StringReverse {

	public static void main(String[] args) {
		
		//Print Reverse String
		String a = "Punit Verma";
		
		for (int i = a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
			
		}
		
		//Capital letter
		System.out.println();
		String b = a.toUpperCase();
		System.out.println(b);
		System.out.println(a);
		
		//Storing reverse string
		String R = "";
		for (int i = a.length()-1;i>=0;i--)
		{
			R = R+a.charAt(i);
			
		}
		System.out.println("Reverse string is "+R);
		
		//Check for palindrome string
		String f = "madam";
		String g = "";
		String h = "Punit";
		String j = "";
		
		for(int i = f.length()-1;i>=0;i--)
		{
			g = g + f.charAt(i);
		}
		for(int i = h.length()-1;i>=0;i--)
		{
			j = j + h.charAt(i);
		}
		System.out.println(g);
		System.out.println(j);
		
		if (f.equals(g))
		{
			System.out.println("The " + f +" is Palindrome");
		}
		else
		{
			System.out.println("The " + f +" is not Palindrome");
		}
		
		if (h.equals(j))
		{
			System.out.println("The " + f +" is Palindrome");
		}
		else
		{
			System.out.println("The " + f +" is not Palindrome");
		}
	}

}
