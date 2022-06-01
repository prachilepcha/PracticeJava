import java.util.Scanner;

public class kmToMetre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Convert Kilometers into Meters");
		System.out.println("Enter value in kilometers: ");
		float km = sc.nextFloat();
		
		float mtr = km*1000;
		System.out.print(km + " kilometers is equal to " + mtr + " meters.");

	}

}
