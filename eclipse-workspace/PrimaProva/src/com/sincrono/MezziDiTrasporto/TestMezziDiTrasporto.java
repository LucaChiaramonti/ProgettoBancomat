package com.sincrono.MezziDiTrasporto;

import java.util.Scanner;

public class TestMezziDiTrasporto {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Ibridi b=new Ibridi("FH44HB4","elettricità","giallo","Iveco");
		AutoElettrica a=new AutoElettrica("FH44HB9","elettricità","blue","Toyota");
		
		System.out.println("inserisci il colore del bus");
		b.setColore(input.next());
		System.out.println("inserisci la marca del bus");
		b.setMarca(input.next());
		System.out.println("La targa è "+b.getTarga()+"il colore è "+b.getColore()+" la marca è "+b.getMarca());
		System.out.println("ed è alimentata da");
		b.stampaAlimentazione();
		
		System.out.println("inserisci il colore della macchina");
		a.setColore(input.next());
		System.out.println("inserisci la marca della macchina");
		a.setMarca(input.next());
		System.out.println("La targa è "+a.getTarga()+"il colore è "+a.getColore()+" la marca è "+a.getMarca());
		System.out.println("ed è alimentata da ");
		a.stampaAlimentazione();
	}
}
