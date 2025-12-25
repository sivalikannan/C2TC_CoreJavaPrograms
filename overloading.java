package polymorphism;

public class overloading {
	
	int addition(int a, int b)
	{
		return a+b ;
	}
	double addition (double a, double b)
	{
		return a+b ;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloading c = new overloading();
		
		System.out.println("Addition is: "+ c.addition(1,2));
		System.out.println("Addition is: "+ c.addition(1.89f,2.98f)) ;

	}

}
