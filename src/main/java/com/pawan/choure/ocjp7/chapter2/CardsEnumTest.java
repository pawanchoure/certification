package com.pawan.choure.ocjp7.chapter2;

enum Cards { CLUB, SPADE, DIAMOND, HEARTS };

public class CardsEnumTest {

	public static void main(String[] args) {
		for(Cards card : Cards.values())
			System.out.print(card + " ");
	}

}
