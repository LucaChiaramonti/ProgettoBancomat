package com.sincrono.MezziDiTrasporto;

public class Bicicletta implements MezziDiTrasporto {
	private String nome;
	private String colore;
	private int km;
	private int kmpercorsi;
	public Bicicletta(String nome,String colore,int km,int kmpercorsi) {
		this.nome=nome;
		this.colore=colore;
		this.km=km;
		this.kmpercorsi=kmpercorsi;
	}
	
	public int getKmpercorsi() {
		return kmpercorsi;
	}
	public void setKmpercorsi(int kmpercorsi) {
		this.kmpercorsi = kmpercorsi;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setColore(String colore) {
		this.colore=colore;
	}
	public void setkm(int km) {
		this.km=km;
	}
	public int getKm() {
		return km;
	}
	public String getColore() {
		return colore;
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
		// TODO Auto-generated method stub
		
	}
}
