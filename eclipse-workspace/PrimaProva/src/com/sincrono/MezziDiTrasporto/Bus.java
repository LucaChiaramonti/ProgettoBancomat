package com.sincrono.MezziDiTrasporto;

public class Bus implements MezziDiTrasporto {
	protected int sedili;
	protected int finestrini;
	protected String targa; String alimentazione;String marca;String colore;
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public void accelerare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stampaAlimentazione() {
		System.out.println(alimentazione);
	}
}
