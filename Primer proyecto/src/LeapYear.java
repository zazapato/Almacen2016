import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int year;
		System.out.println("enter a year: ");
		year= input.nextInt();
		
		//operaciones
		if((year%4==0 && year%100 !=0) || (year%400==0)){
			System.out.println(year + " is leap ");
		}else
			System.out.println(year + " is not leap ");
				
	}

}