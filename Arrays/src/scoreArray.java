import java.util.Scanner;

public class scoreArray {

	public static void main(String[] args) {
		Scanner Input= new Scanner(System.in);
		String[] scores = new String[4];
		
		for(int i=0; i < scores.length; i++) {
		System.out.println("Please enter the score.");
				scores[i]=Input.nextLine();
		}
			
		for(int i=0; i < scores.length; i++) {
				System.out.println("Score: " +scores[i]);
		}
			
			
			
		Input.close();
	}
		

}
