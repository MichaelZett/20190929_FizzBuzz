package de.fernunihagen;

public class FizzBuzzApp {

	public static void main(String[] args) {
		Kid kidOne = new Kid();

		for (int i = 1; i <= 100; i++) {
			kidOne.sayWord(i);
			if (i != 100) {
				System.out.print(", ");
			}
		}
	}

}
