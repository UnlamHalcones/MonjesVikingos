package edu.unlam.halcones.estados.conState;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Calmado;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Estado;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Normal;

public class CalmadoTests {
	
	Estado estado;

	@Before
	public void setUp() {
		estado = new Calmado();
	}

	@Test
	public void cuandoRecibeAtaque() {
		assertEquals(new Calmado(), estado.recibirAtaque());
	}

	@Test
	public void cuandoAtaca() {
		assertEquals(new Normal(), estado.atacar());
	}
	
	@Test
	public void cuandoMedita() {
		assertEquals(new Calmado(), estado.meditar());
	}
	
}
