import java.util.Scanner;
public class MinutesToYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number of minutes: ");
		int minutes= input.nextInt();
		
		int years = minutes/525600;
		int days=  (minutes%525600) /1440;
		int remainingminutes= days % 525600;
		
		
		System.out.println(minutes + " minutes is " + years + " years and " + remainingminutes + " days ");
		
		
	}

}
