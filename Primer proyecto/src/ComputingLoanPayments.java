import java.util.Scanner;
public class ComputingLoanPayments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      double loanAmount;
      double monthlyInterest;
      double years;
      double totalPayment;
      double result;
      
      System.out.println("enter loan Amount: ");
      loanAmount = input.nextDouble();
      
      System.out.println("enter a monthlyInteres: ");
      monthlyInterest = input.nextDouble();
      
      System.out.println("enter the number of years: ");
      years = input.nextDouble();
      
      //operaciones
      result = (loanAmount * monthlyInterest/1200) / (1-(1 / Math.pow(1 + monthlyInterest/1200 , years * 12)));
      totalPayment = result * years * 12;
      System.out.println("monthly Payment is: " + result);
	}

}
