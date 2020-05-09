package edu.unlam.halcones.monjes.vikingos.sinState;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
public class MonjeVikingoTest {

	MonjeVikingo monje;

	@Before
	public void setUp() {
		monje = new MonjeVikingo();
	}

	@Test
	public void iniciaNormal() {
		assertEquals("normal", monje.getEstado());
	}

	@Test
	public void quedaCalmadoSiMeditaEstandoNormal() {
		monje.meditar();
		assertEquals("calmado", monje.getEstado());
	}

	@Test
	public void quedaNormalSiAtacaEstandoCalmado() {
		Vikingo otroVikingo = new MonjeVikingo();
		monje.meditar();
		monje.atacar(otroVikingo);
		assertEquals("normal", monje.getEstado());
	}

	@Test
	public void quedaColericoCuandoRecibeUnAtaque() {
		monje.recibirAtaque(new BigDecimal(1));
		assertEquals("colerico", monje.getEstado());
	}

	@Test
	public void quedaBerserkerCuandoRecibeDosAtaques() {
		monje.recibirAtaque(new BigDecimal(1));
		monje.recibirAtaque(new BigDecimal(2));
		assertEquals("berserker", monje.getEstado());
	}
	
	@Test
	public void quedaBerserkerCuandoRecibeTresOMasAtaques() {
		monje.recibirAtaque(new BigDecimal(1));
		monje.recibirAtaque(new BigDecimal(2));
		monje.recibirAtaque(new BigDecimal(3));
		assertEquals("berserker", monje.getEstado());
	}
	
	@Test
	public void quedaColericoPeroAlMeditarQuedaNormal() {
		monje.recibirAtaque(new BigDecimal(1));
		monje.meditar();
		assertEquals("normal", monje.getEstado());
	}

	@Test
	public void quedaBerserkerPeroAlMeditarQuedaNormal() {
		monje.recibirAtaque(new BigDecimal(1));
		monje.recibirAtaque(new BigDecimal(2));
		monje.meditar();
		assertEquals("normal", monje.getEstado());
	}	

	@Test
	public void quedaCalmadoSiMeditaEstandoCalmado() {
		monje.meditar();
		monje.meditar();
		assertEquals("calmado", monje.getEstado());
	}
	
}