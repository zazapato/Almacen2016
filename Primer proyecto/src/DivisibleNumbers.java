import java.util.Scanner;
public class DivisibleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println(" enter a number: " );
		
		int number; number = input.nextInt();
		//operaciones
		
		if (number % 5 == 0){
		System.out.println(number + " is divisible by 5 " );
		
		}
		if (number % 2 == 0){
		System.out.println(number + " is divisible by 2 " );
		}
	}

}
