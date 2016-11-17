import java.util.Scanner;
public class CelsyusDegrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    double celsius;
    double farenheit;
    System.out.print("enter farenheit degrees");
    farenheit = input.nextDouble();
    //operacion
    celsius = (5.0/9) * (farenheit - 32);
    
    System.out.print(farenheit + " farenheit degrees are " + celsius + " celsius degrees");
    		
	}

}
