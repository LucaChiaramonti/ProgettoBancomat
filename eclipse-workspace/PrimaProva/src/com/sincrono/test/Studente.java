package com.sincrono.test;

public class Studente extends Persona {
	public int esamiSvolti;
	public double media;
	public String matricola;
	public Studente() {
		super();
	}
	public Studente(String nome,String cognome,int eta) {
		super(nome,cognome,eta);
	}
	public Studente(String nome,String cognome,int matricola,int voti) {
		super(nome,cognome,matricola,voti);
	}
	public int getEsamiSvolti() {
		return esamiSvolti;
	}
	public void setEsamiSvolti(int esamiSvolti) {
		this.esamiSvolti = esamiSvolti;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public void setMatricola(String next) {
		// TODO Auto-generated method stub
		
	}
	public void setVoti(int nextInt) {
		// TODO Auto-generated method stub
		
	}

}
