import java.util.Scanner; // scanner is in the java.utill
public class ComputeAreaRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //crea teclado 
		
	    double width;
		width = input.nextDouble();
		System.out.print("Enter a number of width"); //mensaje para el usuario
		
		double length;
			 System.out.print("Enter a number of length");
			 length = input.nextDouble();
		double area;
		area= width * length;
		//Compute area
	
		//resultado en pantalla
		System.out.println("the area for the rectangle of width" +
		width +"and length" + length + "is" + area);
		
	}

}