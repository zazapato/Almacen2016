import java.util.Scanner;
public class primerbucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		final int NUMBER_ATTEMPS_ALLOWED=4;
		   int num1 = (int) (Math.random()*10);
	       int num2 = (int) (Math.random()*10);
	        
	       boolean isCorrect = false;
	       int attemp=0;
	         
	        while(( !isCorrect) && attemp<NUMBER_ATTEMPS_ALLOWED ) {//NUMBER_ATTEMPS_ALLOWED {
	        	System.out.println("how much is "  + num1 +  " + " + num2+ " ?: ");
	              int answer = input.nextInt();
	              isCorrect=(num1+num2)==answer;
	          	++attemp;
	        if(!isCorrect)
	        
	        	System.out.println("try it again!! "+ "Intento: " + (4-attemp));
	        else
	        	System.out.println("congrats!! nºintentos= " +attemp+ " de 4.");
	        
	        if ((!isCorrect)&& attemp == 0)
	        	System.out.println("No te quedan intentos.");		       			
				
}	        	        		
}
}
