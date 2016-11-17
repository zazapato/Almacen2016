import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner input = new Scanner(System.in);
		
		double bmi;
		double weight;
		double height;
		System.out.println("¿cuanto pesas en kilos?: ");
	    weight = input.nextDouble();
	    System.out.println(" ¿cuanto mides en metros?: ");
	    height= input.nextDouble();
	    
	    //operaciones
	    
	   bmi= weight/(height*height);
	   
	   if(bmi < 18.5) {
		  System.out.println(bmi + " estas por debajo del peso adecuado ");
		
		}else
			if (bmi<25.0){
		System.out.println(bmi+ " tu peso es normal ");
		
		}else
		if (bmi<30){
		System.out.println(bmi + " tienes sobrepeso ");	
		
		}else
		if (30< bmi){
		System.out.println(bmi +" estas obeso ");	
		}
		
		
		
	}	

}
