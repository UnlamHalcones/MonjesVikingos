package edu.unlam.halcones.monjes.vikingos.conState;

import java.math.BigDecimal;

import edu.unlam.halcones.monjes.vikingos.conState.estados.Estado;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Normal;

public class MonjeVikingo extends Vikingo {
	private Estado estado;
	private BigDecimal vida;
	private BigDecimal ataque;

	public MonjeVikingo() {
		this.vida = new BigDecimal(100);
		this.ataque = BigDecimal.TEN;
		this.estado = new Normal();
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

	public Estado getEstado() {
		return estado;
	}

}
