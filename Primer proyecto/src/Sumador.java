import java.util.Scanner;
public class Sumador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        
        System.out.println(num1 + "+" + num2 + "= ?");
        
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        boolean isCorrect = (num1 + num2) == answer;
        
        System.out.println(num1 + " + " + num2 + " = " + answer + " is " + isCorrect);
        
        
       
		
	}

}
