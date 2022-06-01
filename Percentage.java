import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// Create Scanner object
		
		System.out.println("Calculating the percentage of a student");
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your roll no.: ");
		String rollNumber = sc.nextLine();
		
		System.out.println("Enter your marks.");
		int total = 500;
		
		System.out.print("Java: ");
		int java = sc.nextInt();
		
		System.out.print("OOPS: ");
		int oops = sc.nextInt();
		
		System.out.print("DSA: ");
		int dsa = sc.nextInt();
		
		System.out.print("Python: ");
		int python = sc.nextInt();
		
		System.out.print("Cloud Computing: ");
		int cloud = sc.nextInt();
		
		
		int marksObtained = java + oops + dsa + python + cloud;		// Adding all subject's marks
		
			if (marksObtained > total)		// If total marks obtained exceeds total marks.
				System.out.print("Incorrect! Write your marks correctly.");
				else {
					int percent = ((marksObtained*100)/total);		// Percentage calculating formula
					System.out.print("Your percentage is: " + percent);
				}		
	}

}
