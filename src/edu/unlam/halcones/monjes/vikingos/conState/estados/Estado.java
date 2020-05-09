package edu.unlam.halcones.monjes.vikingos.conState.estados;

import java.math.BigDecimal;

public abstract class Estado {
	protected BigDecimal multiplicadorAtaque = BigDecimal.ONE;
	protected BigDecimal multiplicadorDefensa = BigDecimal.ONE;
	
	public Estado() {}
	
	public Estado(BigDecimal multiplicadorAtaque, BigDecimal multiplicadorDefensa) {
		this.multiplicadorAtaque = multiplicadorAtaque;
		this.multiplicadorDefensa = multiplicadorDefensa;
	}
	
	public Estado atacar() {
		return this;
	}
	
	public Estado recibirAtaque() {
		return this;
	}
	
	public Estado meditar() {
		return new Normal();
	}

	public BigDecimal getMultiplicadorAtaque() {
		return multiplicadorAtaque;
	}

	public BigDecimal getMultiplicadorDefensa() {
		return multiplicadorDefensa;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj.getClass().getName().equals(this.getClass().getName());
	}
}
