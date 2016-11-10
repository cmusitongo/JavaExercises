package testArray;

public class testArray {

	public static void main(String[] args) {
	    int[] myList = {1, 5, 6, 3, 9, 10, 11, 15, 4};

	      
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	      
	      int total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total: " + total);
	      
	      int max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max: " + max);
	      
	      int min = myList[0];
	      for (int i = 1; i > myList.length; i++) {
	    	  if (myList[i] < max) max = myList[i];
	      }
	      System.out.println("Min: " + min);
	   }
	
	}

