import java.util.Scanner;
public class Triangle {
	public static void main(String[] args){
		int base = 0;
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the number of asteriks (*) for the base of the triangle: ");
		base = input.nextInt();
		
		for (int i = 1; i <= base; i += 1){
			for (int j = 1; j <= i; j += 1){
				System.out.print("*");
			}
			System.out.println("");
		}
		input.close();
	}
}