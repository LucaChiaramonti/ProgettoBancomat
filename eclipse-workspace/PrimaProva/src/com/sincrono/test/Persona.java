package com.sincrono.test;

import com.sincrono.MezziDiTrasporto.Bicicletta;

public class Persona implements EsseriViventi {
	protected String nome,cognome,residenza;			//il private serve per l'incapsulamento
	private int eta;
	private char sex;
	Bicicletta b;										//dichiarazione dell'oggetto
	private int voti;
	public Persona() {}
	public Persona(String nome,String cognome,int eta,int voti) {//overloading firma con 4 parametri
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.voti=voti;
	}
	public Persona(String nome,String cognome,int eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	public boolean isMinorenne() {
		
		return eta<18;
	}
	public boolean isAdolescente() {
		return eta>=14&&eta<18;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) { 				//i get e i set servono per bypassare l'incapsulamento
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getResidenza() {
		return residenza;
	}
	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Bicicletta getB() {
		return b;
	}
	public void setB(Bicicletta b) {
		this.b = b;
	}
	public void setEta(int eta) 
	{
		this.eta = eta;
	}
	public int getEta() {
		return eta;
	}
	public boolean acquistaBicicletta() {
		return false;
	}
	public String getnome() {
		return nome;
	}
	@Override
	public void bere() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mangiare() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void respirare() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dormire() {
		// TODO Auto-generated method stub
		
	}
}
