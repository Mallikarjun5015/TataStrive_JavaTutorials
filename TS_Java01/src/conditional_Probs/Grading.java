package conditional_Probs;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();

		if (marks > 100 || marks < 0) {
			System.out.println("Please enter the valid marks in the range 0 to 100..");
		} else if (marks >= 91) {
			System.out.println("Student grade is A+ grade");
		} else if (marks >= 81) {
			System.out.println("Student grade is A grade");
		} else if (marks >= 71) {
			System.out.println("Student grade is B+ grade");
		} else if (marks >= 61) {
			System.out.println("Student grade is B grade");
		} else if (marks >= 51) {
			System.out.println("Student grade is C+ grade");
		} else if (marks >= 41) {
			System.out.println("Student grade is C garde");
		} else if (marks >= 31) {
			System.out.println("Student grade is D+ grade");
		} else if (marks >= 21) {
			System.out.println("Student grade is D grade");
		} else {
			System.out.println("Student grade is F grade");
		}

	}

}
