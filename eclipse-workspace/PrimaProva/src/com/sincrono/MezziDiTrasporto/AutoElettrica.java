package com.sincrono.MezziDiTrasporto;

public class AutoElettrica extends Auto {
	
	private String alimentazione="elettricità";
	
	protected AutoElettrica (String targa,String alimentazione,String marca,String colore) {
		this.alimentazione=alimentazione;
		this.targa=targa;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public void stampaAlimentazione() {
		System.out.println(alimentazione);
	}
}
