import java.util.Scanner;


public class sLength 
{

	public static void main(String[] args) 
	{
		Scanner Input= new Scanner(System.in);
		
		System.out.println("Enter the first word");
		String word1= Input.next();
		double w1l= word1.length();
		
		
		System.out.println("Enter the second word");
		String word2= Input.next();
		double w2l = word2.length();
		
		double average= (w1l+w2l)/2;
		
		System.out.println("Length: " + (w1l + w2l));
		System.out.println("Average Length: " + average);
		
	}

}
