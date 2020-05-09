package edu.unlam.halcones.monjes.vikingos.sinState;

import java.math.BigDecimal;

public class Estado {
	protected String nombre = "normal";
	protected BigDecimal multiplicadorAtaque = BigDecimal.ONE;
	protected BigDecimal multiplicadorDefensa = BigDecimal.ONE;

	public Estado() {
		this.nombre = "normal";
		this.multiplicadorAtaque = BigDecimal.ONE;
		this.multiplicadorDefensa = BigDecimal.ONE;
	}
	
	public Estado(BigDecimal multiplicadorAtaque, BigDecimal multiplicadorDefensa) {
		this.nombre = "normal";
		this.multiplicadorAtaque = multiplicadorAtaque;
		this.multiplicadorDefensa = multiplicadorDefensa;
	}
	
	public Estado atacar() {
		switch(this.nombre)
		{
			case "calmado":
				this.nombre = "normal";
				this.multiplicadorAtaque = BigDecimal.ONE;
				this.multiplicadorDefensa = BigDecimal.ONE;
			break;
		}
		
		return this;
	}
	
	public Estado recibirAtaque() {
		switch(this.nombre)
		{
			case "normal":
				this.nombre = "colerico";
				this.multiplicadorAtaque = new BigDecimal(2);
				this.multiplicadorDefensa = new BigDecimal(2);
			break;
			
			case "colerico":
				this.nombre = "berserker";
				this.multiplicadorAtaque = new BigDecimal(3);
				this.multiplicadorDefensa = new BigDecimal(0.5);
			break;
		}
		
		return this;
	}
	
	public Estado meditar() {
		switch(this.nombre)
		{
			case "normal":
				this.nombre = "calmado";
				this.multiplicadorAtaque = new BigDecimal(0);
				this.multiplicadorDefensa = new BigDecimal(0);
			break;
			
			case "colerico":
			case "berserker":
				this.nombre = "normal";
				this.multiplicadorAtaque = BigDecimal.ONE;
				this.multiplicadorDefensa = BigDecimal.ONE;
			break;
		}
		
		return this;
	}

	public BigDecimal getMultiplicadorAtaque() {
		return multiplicadorAtaque;
	}

	public BigDecimal getMultiplicadorDefensa() {
		return multiplicadorDefensa;
	}
}
