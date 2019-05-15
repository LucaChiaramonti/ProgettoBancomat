package com.sincrono.MezziDiTrasporto;

public class Auto implements MezziDiTrasporto {
	protected String nome; String alimentazione;
	protected String marca;
	protected String targa;
	protected float cavalli;
	protected float velocita;
	protected String colore;
	protected boolean cambioautomatico;
	
	public void accelerare() {
		// TODO Auto-generated method stub
		
	}
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
	public void frenare() {
		// TODO Auto-generated method stub
		
	}
	public void stampaAlimentazione() {
		System.out.println(alimentazione);	
	}
}
