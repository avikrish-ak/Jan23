package sampleA;

public class TestA {

	public static void main(String[] args) {
		
		TestA xyz = new TestA();
		xyz.methodTestA();
		xyz.methodTestB();
		xyz.methodTestC();
		methodTestD();
		
		System.out.println(xyz);
		
		TestA abc = new TestA();
		abc.methodTestA();
		abc.methodTestB();
		abc.methodTestC();
		
		System.out.println(abc);
		
		
		
		xyz.methodTestA();
		
	}
	
	public void methodTestA()
	{
		System.out.println("Good day...!");
	}
	
	
	private void methodTestB()
	{
		System.out.println("Good Evening...!");
	}
	
	
	protected void methodTestC()
	{
		System.out.println("Java program...!");
	}

	static void methodTestD()
	{
		System.out.println("Selenium program...!");
	}
}
