package arrays;
import java.util.Scanner;
public class dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[]contador=new int[6];
		
		for(int i = 1; i<=100;i++){
		    int dice = (int) (Math.random()*6)+1;
		    ++contador[dice - 1];
	 } 
		for(int i = 0; i < contador.length ;i++){	
		   System.out.println("The number "+ (i+1)+ " has appeared "+contador[i]+ " times." );
		   }
		int min=0;
		for (int i=1;i<contador.length;i++)
			if(contador[i]<contador[min])
				min=i;
			System.out.println("The loser is : "+ (min+1)+ " with "+ contador [min]+ " Times.");
  }
}