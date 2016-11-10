import java.util.Scanner;


public class currencyCon 
{

	public static void main(String[] args) 
	{
		Scanner Input= new Scanner(System.in);
		
		System.out.println("Enter the amount in Euros(€)");
		int euros= Input.nextInt();
		
		
		double conv= euros*1.4077;
		
		
		System.out.println("Dollars($): " +conv);
		
	}

}
