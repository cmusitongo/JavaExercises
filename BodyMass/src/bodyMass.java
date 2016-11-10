import java.util.Scanner;


public class bodyMass 
{

	public static void main(String[] args) 
	{
		Scanner Input= new Scanner(System.in);
		
		System.out.println("Please enter your BMI(Body Mass Index)");
		double weight= Input.nextDouble();
		
		if (weight >= 0 && weight <=18.49)
		{
			System.out.println("Underweight:");
		}
		
			if (weight >=0 && weight <=16)
			{ 
			System.out.println("You're serverely thin"); 
			}
			
			else if (weight >=16 && weight <=16.99)
			{ 
			System.out.println("You're moderately thin"); 
			}
			
			else if (weight >=17 && weight <=18.49)
			{ 
			System.out.println("You're mildy thin"); 
			}
			
		if (weight >= 18.5 && weight <=24.99)
		{
			System.out.println("You're within normal range");
		}
		
		if (weight >= 25)
		{
			System.out.println("Overweight:");
		}
			if (weight >=25 && weight <=29.99)
			{ 
				System.out.println("You're pre-obesity"); 
			}
			
			else if (weight >=30 && weight <=34.99)
			{ 
				System.out.println("You're Class I Obese"); 
			}
			
			else if (weight >=35 && weight <=39.99)
			{ 
				System.out.println("You're Class II Obese"); 
			}
			
			else if (weight >=40)
			{ 
				System.out.println("You're Class III Obese"); 
			}


	}

}
