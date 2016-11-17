
public class MilliSecondToHours {

	public static void main(String[] args) {
		// TODO Auto-generated method st
        long milliseconds = System.currentTimeMillis();
        
        long seconds = milliseconds / 1000;
       
        long totalcurrentseconds = seconds % (24*60*60);
       
        long currentseconds = totalcurrentseconds % 60;
       
        long totalminutes = totalcurrentseconds/60;
        
        long currenthours = totalminutes/60 + 2;
        
        long currentminutes = totalminutes%60;
       
        System.out.print(currenthours + ":" + currentminutes + ":" + currentseconds);
               
        
	}

}
