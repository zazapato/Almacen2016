package arrays;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);

     int [] mylist = new int[20];
     
     for(int i = 0; i<mylist.length; i++){
    	 System.out.println("enter an element " + i);
     mylist[i]=input.nextInt();
	}
	}
}
