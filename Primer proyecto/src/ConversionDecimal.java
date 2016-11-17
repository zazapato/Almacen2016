import java.util.Scanner;
public class ConversionDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);
		  
		 double number;
		 double tax;
		 double result;
		 System.out.print("enter a number:");
		 number = input.nextDouble();
		 
		 //operacion
		 tax = number * 0.21;
		 result = ((int)((number + tax)*100))/100.0;
		 
		 //resultado en pantalla
		 System.out.print("the price with IVA is " + result);
		 
		 
	}

}
