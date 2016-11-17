import java.util.Scanner; //se importa la libreria
public class MinutosSegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in); // creo el teclado
   
    int minutes;
    int seconds; 
    int seconds2;
    
    
    System.out.print("enter the seconds");
    seconds = input.nextInt();
    
    //operacion
    minutes = seconds / 60;
    seconds2 = seconds % 60;
     
    System.out.print(seconds + " seconds is " + minutes + " minutes and " + seconds2 + " seconds ");    
	}

}
