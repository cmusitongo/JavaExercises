import java.util.Scanner;


public class simpleArray2 {

	public static void main(String[] args) {
		Scanner Input= new Scanner(System.in);
		
		System.out.println("How many students in your class?");
		int arraySize= Input.nextInt();
		
		String[] names = new String[arraySize];
		int[] scores = new int[arraySize];
		
		int total= 0;
		
		
		//Creates a loop
		for(int i=0; i < names.length; i++) {
			System.out.println("Please enter a name");
			names[i]= Input.next();
			System.out.println("Enter the score for " + names[i]);
			scores[i]= Input.nextInt();
			total= total+scores[i];
			
		}
		
		double average= total/arraySize;
		
		
		//Creates an output loop to display to the user
		for(int i=0; i < names.length; i++) {
			System.out.println(names[i] +" scored: " +scores[i]);
			
			if (scores[i] > average) {
				System.out.println(names[i] +"'s score is above average");
			}
			
			else {
				System.out.println(names[i] +"'s score is below average");
			}
			
		}
		
		System.out.println("----------------");
		System.out.println("Average score: "+ average);
		System.out.println("----------------");
		
		
		Input.close();
	}

}
