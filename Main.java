import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main {

	public static void checkCard(int a) {

		// used to check the card against the library of cards in the deck
		// and to take out 1 card when it finds out which card it matches with

		int x = 0;
		for (int c : Cards.deck) {
			if (a == c) {
				x++;
				Cards.deck.set(x, c - 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		int pCard1 = (int) (13 * Math.random() + 1); // generate player card 1
		int pCard2 = (int) (13 * Math.random() + 1); // generate player card 2
		int pCard3 = (int) (13 * Math.random() + 1); // generate player card 3
		int pCard4 = (int) (13 * Math.random() + 1); // generate player card 4

		checkCard(pCard1);
		checkCard(pCard2);
		checkCard(pCard3);
		checkCard(pCard4);

		System.out.println("Your cards are " + pCard1 + ", " + pCard2 + ", " + pCard3 + ", and " + pCard4 + "\n");

		System.out.println(Cards.deck.get(0));
		System.out.println(Cards.deck.get(1));
		System.out.println(Cards.deck.get(2));
		System.out.println(Cards.deck.get(3));
		System.out.println(Cards.deck.get(4));
		System.out.println(Cards.deck.get(5));
		System.out.println(Cards.deck.get(6));
		System.out.println(Cards.deck.get(7));
		System.out.println(Cards.deck.get(8));
		System.out.println(Cards.deck.get(9));
		System.out.println(Cards.deck.get(10));
		System.out.println(Cards.deck.get(11));
		System.out.println(Cards.deck.get(12));

	}
}
