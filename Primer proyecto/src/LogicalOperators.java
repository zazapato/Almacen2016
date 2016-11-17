import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println(" enter a number: ");
		int i= input.nextInt();
		if (i % 2 == 0 && i % 3 ==0){
			System.out.println(i + " is divisible by both 2 and 3 ");
		}else
			if (i% 2 ==0 || i % 3 ==0){
			System.out.println(i + " is divisible by either 2 or 3. but not both. ");
			}else
		
			if (i % 2 ==0^ i % 3 ==0){
			System.out.println(i +" is divisible by 2 or 3 ");
		}
			
		
		
			
		}	
	}
