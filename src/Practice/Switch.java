package Practice;

public class Switch {
public static void main (String [] args )
	{
		int a = 1;
		
		switch (a)
		{
		case 1 : System.out.println("Value is 1"); // 
        System.out.println("Hi");
        break; // break is imp or else program 
               //will execute after it
        
        case 2 : System.out.println("Value is 2");
        System.out.println("Hello");
        break;
        
        case 3 : System.out.println("Value is 3");
        System.out.println("Bye");
        break;
        
        default : System.out.println("No data");
         System.out.println("Press 1 2 3");
		}
			
	}
}
