package edu.wit.cs.comp1000;
import java.util.Scanner; 
/**
 * Example solution to PA2a
 * @author Hector Padilla
 * @date 9/25/2019
 */
// TODO: document this class
public class PA2a {
	private static Scanner scnr;
	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		System.out.print("Enter five whole numbers: ");
		scnr = new Scanner(System.in);
		
		int var1 = scnr.nextInt();
		int var2 = scnr.nextInt();
		int var3 = scnr.nextInt();
		int var4 = scnr.nextInt();
		int var5 = scnr.nextInt();
		
		
		int sumPos = 0;
		int sumNeg = 0; 
		int countPos = 0;
		int countNeg = 0;
			if (var1 > 0) {
				sumPos += var1;	
				countPos += 1;
			} else {
				sumNeg += var1;
				countNeg += 1;
			}
			if (var2 > 0) {
				sumPos += var2;
				countPos += 1;
			} else {
				sumNeg += var2;
				countNeg += 1;
			}
			if (var3 > 0) {
				sumPos += var3;	
				countPos += 1;
			} else {
				sumNeg += var3;
				countNeg += 1;
			}
			if (var4 > 0) {
				sumPos += var4;	
				countPos += 1;
			} else {
				sumNeg += var4;
				countNeg += 1;
			}
			if (var5 > 0) {
				sumPos += var5;	
				countPos += 1;
			} else {
				sumNeg += var5;
				countNeg += 1;
			}
		int sumAll = sumNeg + sumPos;
		int countAll = countNeg + countPos;
		double avgNeg = 0;
		double avgAll = 0;
		double avgPos = 0;
		if (countPos > 0) {
			avgPos = (1.0 * sumPos) / countPos;
		}
		if (countNeg > 0) {
			avgNeg = (1.0 * sumNeg) / countNeg;
		}
		if (countAll > 0) {
			avgAll = (1.0 * sumAll) / countAll;
		}
		
		String numberPos = "";
		if (countPos == 1) {
			numberPos = "number";
		} else {
			numberPos = "numbers";
		}
		String numberNeg = "";
		if (countNeg == 1) {
			numberNeg = "number";
		} else {
			numberNeg = "numbers";
		}
		System.out.println("The sum of the " + countPos + " positive " + numberPos + ": " + sumPos);
		System.out.println("The sum of the " + countNeg + " non-positive " + numberNeg + ": " + sumNeg);
		System.out.println("The sum of the " + countAll + " numbers: " + sumAll);
		
		System.out.printf("The average of the " + countPos + " positive " + numberPos + ": %.2f%n", avgPos);
		
		System.out.printf("The average of the " + countNeg + " non-positive " + numberNeg + ": %.2f%n", avgNeg);
		
		System.out.printf("The average of the " + countAll + " numbers: %.2f%n", avgAll);
		
		
		
		
		
		/*int fiveWholeNum = scnr.nextInt();
		int sumPositive = scnr.nextInt(); 
		int sumNonPositive = scnr.nextInt();
		double avgPosNum = scnr.nextDouble(); 
		double avgNonPosNum = scnr.nextDouble();
		double avgNum = scnr.nextDouble();
		*/
	}

}


/*Enter five whole numbers: -1 1 -2 2 -3
The sum of the 2 positive numbers: 3
The sum of the 3 non-positive numbers: -6
The sum of the 5 numbers: -3
The average of the 2 positive numbers: 1.50
The average of the 3 non-positive numbers: -2.00
The average of the 5 numbers: -0.60
*/
