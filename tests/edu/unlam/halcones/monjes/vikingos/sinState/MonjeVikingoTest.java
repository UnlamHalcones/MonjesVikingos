package edu.unlam.halcones.monjes.vikingos.sinState;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonjeVikingoTest {

	MonjeVikingo monje;

	@Before
	public void setUp() {
		monje = new MonjeVikingo();
	}

	@Test
	public void creacionConEstadoNormal() {
		Assert.assertEquals("normal", monje.getEstado());
	}

}
