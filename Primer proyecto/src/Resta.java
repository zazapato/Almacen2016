import java.util.Scanner;
public class Resta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input= new Scanner(System.in);
		
		int num1; 
	    int num2;
	    boolean isCorrect;
	    int numberMemory;
	    int answer;
	    num1=(int) (Math.random()*10);
	    num2=(int) (Math.random()*10);
	    
	    
	    //operaciones
	    if (num1 < num2) {
	    numberMemory = num1;
	    num1 = num2;
	    num2 = numberMemory;	
	    
	    System.out.println(num1 + " - " + num2 + " = ? ");
	    answer = input.nextInt();
	    isCorrect = (num1 - num2) == answer; // pregunto si la resta es lo que ha introducido el ususario
	    if (answer == (num1 - num2)) {
	   	System.out.println(answer + " Es correcto ");
	    	}else
	    System.out.println(answer + " Es incorrecto ");
	 }
	}

}
