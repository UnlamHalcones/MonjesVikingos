package edu.unlam.halcones.monjes.vikingos.sinState;

import java.math.BigDecimal;


public class MonjeVikingo extends Vikingo {
	private Estado estado;
	private BigDecimal vida;
	private BigDecimal ataque = BigDecimal.TEN;
	
	public MonjeVikingo() {
		estado = new Estado();
	}
	
	@Override
	public void atacar(Vikingo otherVikingo) {
		estado = estado.atacar();
		otherVikingo.recibirAtaque(ataque.multiply(estado.getMultiplicadorAtaque()));
	}

	@Override
	public void recibirAtaque(BigDecimal danio) {
		vida = vida.subtract(danio.multiply(estado.getMultiplicadorDefensa()));
		estado = estado.recibirAtaque();
	}

	@Override
	public void meditar() {
		estado = estado.meditar();
	}

	public String getEstado() {
		return estado.nombre;
	}

}
