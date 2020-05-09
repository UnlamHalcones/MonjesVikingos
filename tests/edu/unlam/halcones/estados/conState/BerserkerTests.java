package edu.unlam.halcones.estados.conState;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Berserker;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Estado;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Normal;

public class BerserkerTests {
	
	Estado estado;

	@Before
	public void setUp() {
		estado = new Berserker();
	}

	@Test
	public void cuandoRecibeAtaque() {
		assertEquals(new Berserker(), estado.recibirAtaque());
	}

	@Test
	public void cuandoMedita() {
		assertEquals(new Normal(), estado.meditar());
	}

	@Test
	public void cuandoAtaca() {
		assertEquals(new Berserker(), estado.atacar());
	}
	
}
