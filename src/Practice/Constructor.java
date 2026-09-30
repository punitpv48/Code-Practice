package Practice;

public class Constructor {

	int x;
	
	Constructor ()                // user defined constructor with 0 argument
	{
		x = 100;
	}
	
	Constructor (int y)          // user defined constructor with argument
	{
		x=y;
	}
	
	static void Xyz()             // user defined static method
	{
		System.out.println("User defined static method");
    }
	
	public static void main(String[] args) {            // system defined static method
		
		Constructor a = new Constructor ();        // user defined constructor with 0 argument call
		System.out.println(a.x);
		
		Constructor b = new Constructor (500);     // user defined constructor with argument call
		System.out.println(b.x);
		
		Xyz ();                                    // user defined method call
	}
	
}
