import java.util.Scanner;
public class monetaryUnits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
     
      double totaleuros;
      int oneeuro;
      int fiftycoins;
      int twentycoins;
      int tencoins;
      int fivecoins;
      int twocoins;
      int onecoins;
      
      System.out.print("enter the total euros");
      totaleuros = input.nextDouble();
      
      //operaciones
      
      int totalcent = (int)(totaleuros * 100);
      oneeuro = totalcent / 100;
      fiftycoins = (totalcent%100) / 50 ;
      twentycoins = ((totalcent%100)%50) / 20;
      tencoins = (((totalcent%100)%50)%20)/ 10;
      fivecoins = ((((totalcent%100)%50)%20)%10) /5;
      twocoins = (((((totalcent%100)%50)%20)%10)%5) /2;
      onecoins = (((((totalcent%100)%50)%20)%10)%5)%2;
   
      
    		  
      System.out.println(totaleuros + " son " + oneeuro + " monedas de un euro " + fiftycoins 
    		  + " monedas de cincuenta centimos " + twentycoins + " monedas de veinte centimos "
    		  + tencoins+ " monedas de diez cetimos "+ fivecoins+ " monedas de cinco centimos "+
    		  twocoins+ " monedas de dos centimos " + onecoins+ " monedas de un centimo ");	  
      
      
      
      
      
	}

}
