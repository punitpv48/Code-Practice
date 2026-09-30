package Practice;

public class Method {

void Test ()
{
System.out.println("User defined non static Method");
}


static void Test1 () 
{
	System.out.println("User defined static Method");	
}

public static void main(String[] args) {

	Method a = new Method();
	a.Test();

	Test1();
	
}

	
}
