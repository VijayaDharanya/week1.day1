package week1.day1;

public class Mobile 
{
	public static void makeCall()
	{
		System.out.println("give a ring");
	}
	
	public static void sendMessage() 
	{
		System.out.println("ping me");
	}

	public static void main(String[] args)
	{
		System.out.println("this is my mobile");
		makeCall();
		sendMessage();
	}
}
//a.create package name as week1.day1 under src/main/java
//b.create a new class as "Mobile" under week1.day1
//c.create 2 methods(makeCall(),sendMessage()) with simple print statement
//d.create main method
//e.print a statement "this is my mobile"
//f.run and confirm the output printed in console