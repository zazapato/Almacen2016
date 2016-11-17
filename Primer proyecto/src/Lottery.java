import java.util.Scanner;
    public class Lottery {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int) (Math.random()*100);
        
 // Prompt the user to enter a guess
        
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

 // Get digits from lottery
        int lotteryDigit1 = (num) / 10;
        int lotteryDigit2 = (num)% 10;
        

 // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = (guess % 10);
       

        System.out.println("The lottery number is " + num);

  // Sum up both sets of digits to compare for 3 inconsecutive matches 

 // REGLA 1 Check the guess
        if (guess == num)
            System.out.println("Exact match: you win $10,000");
 // REGLA 2   
        else if ((guessDigit1 == lotteryDigit2)
       
            && (guessDigit2 == lotteryDigit1))
           
            System.out.println("Match all digits: you win $3,000");
// REGLA 3
        else if ((guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2)
            || (guessDigit2 == lotteryDigit1)
            || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");

        else
            System.out.println("Sorry, no match");
    }
 }