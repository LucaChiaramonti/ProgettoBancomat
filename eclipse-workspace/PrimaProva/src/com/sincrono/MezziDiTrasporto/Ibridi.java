package com.sincrono.MezziDiTrasporto;

public class Ibridi extends Bus {
	
	private String targa;
	private String alimentazione="elettricità";
	
	protected Ibridi (String targa,String alimentazione,String marca,String colore) {
		this.targa=targa;
		this.alimentazione=alimentazione;
	}
	public String getTarga() {
		return targa;
	}
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public void stampaAlimentazione() {
		System.out.println(alimentazione);
		
	}
}
