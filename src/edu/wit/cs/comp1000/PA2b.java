package edu.wit.cs.comp1000;
/*
 * Example solution to PA2b
 * @author Hector Padilla
 * @date 9/20/19
 */
import java.util.Scanner;


// TODO: document this class
public class PA2b {

	private static Scanner scnr;

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here

		System.out.print("Enter a b c: ");

		scnr = new Scanner(System.in);

		double a= scnr.nextDouble();

		double b= scnr.nextDouble();

		double c= scnr.nextDouble(); 




		double formulaP; 
		formulaP =  (Math.pow(b,2) - 4 * a * c); 

		double root1 =  (-b + Math.sqrt(formulaP)) / (2 * a); 

		double root2 =  (-b - Math.sqrt(formulaP)) / (2 * a);

		if (formulaP < 0 ) {
			System.out.println("Roots: " + "imaginary");
		}

		if (formulaP == 0) {
			System.out.printf("Root: %.2f%n", root1);
		}

		if (formulaP > 0) {
			if (root1 > root2) {
				System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
			}
			else 
				System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}


	}















}


