import java.util.Scanner;
public class introduccionFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		System.out.println("introduce el dia: ");
		int dia = input.nextInt();
		System.out.println("introduce el mes: ");
		int mes = input.nextInt();
		System.out.println("introduce el año: ");
		int year = input.nextInt();
	
		
		//  operaciones
		
	boolean isCorrect = true;
	boolean isLeapYear= ((year%4==0 && year%100 !=0) || (year%400==0));
	
	if(dia >31 || dia <1 || mes >12 || mes<1)
      isCorrect=false;
	
	else 
     
		if(dia>30 && (mes==2)|| mes==4|| mes==6|| mes == 9|| mes==11)
      isCorrect=false;
    else
        
	    if(mes==2 && dia >=29)
	    	isCorrect=false;
	    else
	    	if(mes==2&& !isLeapYear &&  dia>=29)
	    		isCorrect = false;
    System.out.println(dia+"/"+mes+"/"+year);
    
    if(isCorrect)
    	System.out.println("is Correct");
    else
    	System.out.println(" it is not correct ");
    
}
}