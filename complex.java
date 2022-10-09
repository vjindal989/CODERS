import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Complex {

	private double r;
	private double i;
	static double a1;
	static double b1;
	static int count = 0;
	Complex(double rr, double ii)
	{
		
		r = rr;
		i = ii;
		
		count++;
		
	}
	
	Complex(){
		count++;
	}
	
	public static Complex add(Complex c1, Complex c2)
	{
		a1 = c1.r + c2.r;
		b1 = c1.i + c2.i;
		
		if(b1<0)
		{
			System.out.println(a1 + " " + b1 + "i");
			
		}
		else {
			System.out.println(a1 + "+" + b1 + "i");
			
		}
		return null;
		
	}
	
	public static Complex subtract(Complex c1, Complex c2)
	{
		
		a1 = c1.r - c2.r;
		b1 = c1.i - c2.i;
		
		if(b1<0)
		{
			System.out.println(a1 + " " + b1 + "i");
		}
		
		else
		{
			System.out.println(a1 + "+" + b1 + "i");
			
		}
		
		return null;
		
	}
	
	public void show()
	{
		System.out.println(r + "+" +i + "i");
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Complex c = new Complex(8, 16);
		Complex d = new Complex(5, 15);
		Complex e = new Complex();
		
		System.out.println("number of object: " +count);
		System.out.println("first number");
		d.show();
		System.out.println("sum");
		e = add(c,d);
		System.out.println("difference:");
		e = subtract (c,d);
		
		Path path = Paths.get("C:\\Users\\vasuj\\eclipse-workspace\\first project\\src\\task");
        Files.createDirectories(path);
	}
	
}
