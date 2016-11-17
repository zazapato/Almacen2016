package arrays;

import java.util.Scanner;

public class baraja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deckOfCards = new int[40];
		for (int i = 0; i < deckOfCards.length; i++)
			deckOfCards[i] = i + 1;
		int op;
		int top=0;
		int[]dealedCards;
		do {
			op = menu();

			switch (op) {
			case 1: shuffling(deckOfCards);
		            break;
			case 2:printDeckOfCards(deckOfCards);
				    break;
			case 3:	dealedCards =dealcards(deckOfCards,top);
			        top+=5;
			        printDeckOfCards(dealedCards);
			        break;
	     	}
		} while (op != 4);
		System.out.println("HASTA LUEGO PREMO!!");
	}
	public static int[] dealcards(int[]deck,int top){
		int[]cards= new int[5];
		for(int i =0; i<5;i++)
	    cards[i]=deck[i+top];
		return cards;
		
	}
	public static void shuffling(int[] deck){
		for(int i =0;i<deck.length;i++){
		int j=(int) (Math.random()* deck.length);
		int temp = deck[i];
		deck[i]=deck[j];
		deck[j]=temp;
	  }
	}
	public static void printDeckOfCards(int[] deck) {

		System.out.println("Mi baraja");
		for (int i = 0; i < deck.length; i++) {
			if (i % 10 == 0)
				System.out.println();
			System.out.print(deck[i] + "   ");
		}
	}
	public static int menu() {

		Scanner input = new Scanner(System.in);
        
		System.out.println("");
		System.out.println("menu de opciones");
		System.out.println("----------------");
		System.out.println(" 1.- Baraja del mazo");
		System.out.println(" 2.- visualiza el mazo");
		System.out.println(" 3.- reparte las 5 primeras cartas");
		System.out.println(" 4.- salir del programa");
		System.out.println(" Teclee una opcion : ");

		int op = input.nextInt();
		return op;
	}	
}	
		