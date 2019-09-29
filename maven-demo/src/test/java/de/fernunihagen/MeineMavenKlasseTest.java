package de.fernunihagen;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MeineMavenKlasseTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSomething() {
		assertThat(new MeineMavenKlasse().eineMethode(), is("Ergebnis"));
	}

}
