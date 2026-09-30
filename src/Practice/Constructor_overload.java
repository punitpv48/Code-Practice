package Practice;

public class Constructor_overload {

	Constructor_overload ()
	{
		System.out.println("Zero Arugment Constructor");
	}
	Constructor_overload (int a)
	{
		System.out.println("int type argument");
	}
	Constructor_overload (int b, int c)
	{
		System.out.println("int int type argument");
	}
	Constructor_overload (char a)
	{
		System.out.println("char type argument");
	}
	Constructor_overload (char x, char y)
	{
	System.out.println("int char type argument");	
	}
	Constructor_overload (int x, char y)
	{
	System.out.println("int char type argument");	
	}
	Constructor_overload (char x, int y)
	{
	System.out.println("int char type argument");	
    }
	Constructor_overload (String a)
	{
		System.out.println("String typr argument");
	}
	
	public static void main(String[] args) {
		Constructor_overload a = new Constructor_overload ();
		Constructor_overload b = new Constructor_overload (4);
		Constructor_overload c = new Constructor_overload ( 5 , 6);
		Constructor_overload d = new Constructor_overload ('a');
		Constructor_overload e = new Constructor_overload ('b' , 'c');
		Constructor_overload f = new Constructor_overload (4 , 'd');
		Constructor_overload g = new Constructor_overload ('e' , 5);
		Constructor_overload h = new Constructor_overload ("Velocity");
		}
	
}
