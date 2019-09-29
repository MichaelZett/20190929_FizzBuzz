package de.fernunihagen;

public class Kid {
	private static final String BUZZ_WORD = "Buzz";
	private static final String FIZZ_WORD = "Fizz";
	private static final int BUZZ_NUMBER = 5;
	private static final int FIZZ_NUMBER = 3;

	private String decideWord(int number) {
		if (isNumberDividableBy(number, FIZZ_NUMBER)
		        && isNumberDividableBy(number, BUZZ_NUMBER)) {
			return FIZZ_WORD + BUZZ_WORD;
		} else if (isNumberDividableBy(number, FIZZ_NUMBER)) {
			return FIZZ_WORD;
		} else if (isNumberDividableBy(number, BUZZ_NUMBER)) {
			return BUZZ_WORD;
		} else {
			return String.valueOf(number);
		}
	}

	private static boolean isNumberDividableBy(int number, int divisor) {
		return number % divisor == 0;
	}

	public void sayWord(int i) {
		System.out.print(decideWord(i));
	}

}
