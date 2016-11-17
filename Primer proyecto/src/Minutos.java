import java.util.Scanner;

public class Minutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in); // creo el teclado
		   
		    int minutes;
		    int seconds; 
		    int totalsecs;
		    System.out.print("enter the minutes:");
		    minutes = input.nextInt();
		    System.out.print("enter the seconds:");
		    seconds = input.nextInt();
		    
		    //operacion
		    totalsecs = minutes * 60 + seconds;
		    
		     
		    System.out.print(minutes + " minutes and " + seconds + " seconds are " + totalsecs + " seconds" );  
	}

}
