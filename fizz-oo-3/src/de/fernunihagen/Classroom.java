package de.fernunihagen;

import java.util.LinkedList;
import java.util.List;

public class Classroom {
	Teacher teacher = new Teacher();
	List<Kid> kids = new LinkedList<>();

	public void enter(Kid kid) {
		kids.add(kid);
	}

	public void playFizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			kids.get((i - 1) % kids.size()).sayWord(i);
		}
	}

}
