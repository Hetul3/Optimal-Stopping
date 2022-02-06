package e;
import java.util.Random;

/*The problem goes like this, if you have to try pick the largest number
 * from an array of numbers, but can only see the number once and have to choose it.
 * When is the optimal time to pick a number? An applicable problem would be, 
 * an admission officer has to decide whether to accept or reject a student on
 * the spot based purely off of grades. There is only room for 1 more student
 * to be accepted, so when should the admission officer accept in order
 * to have the highest probability of having chosen the best student?
 * 
 * The answer is reviewing the applications of n/e students, where n is the
 * total number of applicants. Do not accept any of them but keep in mind the
 * highest grade (assuming no one has the highest possible grade), then
 * choose the next student with grades better than the highest student
 * you didn't accept. This gives you the highest chance of accepting 
 * the highest applicant with a probability of 1/e.
 */
public class Main {
	
	static int n = 10000;	//size of the array
	static double e = 2.71828;
	static int m = 1000000000;	//range for the values of the array
	static int Index = (int) Math.round(n/e);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//You could have your own array
	//	int[] arr = {89, 90, 95, 93, 93, 97, 95, 94, 85, 90, 91, 99, 93, 97, 96};
		
		//Have one randomly generated
		Random rand = new Random();
		int[] arr = new int[n];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = rand.nextInt(m);
		}
		
		PrintArray(arr);
		PrintIndex(arr);
		PrintValue(arr);
	}

	private static void PrintValue(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];	//max value until before the Index
		int actualMax = arr[0];	//actual max value of the whole array
		int maxValue = arr[Index];	//value that will be chosen
		
		//finding the value of max
		for(int i = 0; i < Index; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		//if max is less the max value possible
		if(max < m-1) {
			System.out.println("Number to Remember: " + max);
		}
		
		//if max is the max value possible
		else if(max == m-1) {
			System.out.println("Number to Remember: " + max);
			System.out.println("Would choose: " + max);
		}
		
		
		int j = Index;
		
		//finding maxValue
		if(!(max == m-1)) {
			while(arr[j] < max) {	
				j++;	
				maxValue = arr[j];
			}
		
			if(maxValue > max) {
				System.out.println("Would Choose: " + maxValue);
			}
		
			else if(maxValue <= max) {
				maxValue = arr[n-1];
				System.out.println("Would Choose: " + maxValue);
			}
		}
		
		//finding actualMax
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > actualMax) {
				actualMax = arr[i];
			}
		}

		System.out.println("Actual Max: " + actualMax);
	}

	private static void PrintIndex(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Don't pick until " + Index + " elements");
	}

	private static void PrintArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
