import java.util.Scanner;
public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		System.out.println(" enter a note ");
		double note; note = input.nextDouble();
		//operaciones
		 if (note<5){
			System.out.println(" insuficiente pasteloso ");
			
		 }else
		 
			 if (note < 6){
		   System.out.println(" suficiente");
			 }else
			 
			 if (note < 7 ){
				System.out.println(" bien "); 
			 }else
			
				 if (note< 9){
	         System.out.println("notable");
				  
				  }else
			if (note<= 10){
				System.out.println(" sobresaliente ");
				
			}
				
			}
}