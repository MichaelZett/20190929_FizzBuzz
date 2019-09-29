package de.fernunihagen;

public class FizzBuzzApp {

	public static void main(String[] args) {
		Classroom classroom = new Classroom();

		for (int i = 0; i < 5; i++) {
			classroom.enter(new Kid(String.valueOf(i + 1)));
		}

		classroom.playFizzBuzz();
	}

}
