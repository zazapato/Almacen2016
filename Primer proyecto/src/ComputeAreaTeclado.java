import java.util.Scanner; // scanner is in the java.utill
public class ComputeAreaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		Scanner input = new Scanner(System.in);  //crea teclado 
	
		System.out.print("Enter a number of radius"); //mensaje para el usuario
		 radius = input.nextDouble();
		
		//Compute area
		double area = radius * radius * 3.14159;
		
		//resultado en pantalla
		System.out.println("the area for the circle of radius " +
		radius + " is " + area);
		
	}

}