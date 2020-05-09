package edu.unlam.halcones.estados.conState;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Calmado;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Colerico;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Estado;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Normal;

public class NormalTests {
	
	Estado estado;

	@Before
	public void setUp() {
		estado = new Normal();
	}

	@Test
	public void cuandoRecibeAtaque() {
		assertEquals(new Colerico(), estado.recibirAtaque());
	}
	
	@Test
	public void cuandoMedita() {
		assertEquals(new Calmado(), estado.meditar());
	}

	@Test
	public void cuandoAtaca() {
		assertEquals(new Normal(), estado.atacar());
	}
	
}
