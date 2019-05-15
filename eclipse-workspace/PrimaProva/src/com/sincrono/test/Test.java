package com.sincrono.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sincrono.MezziDiTrasporto.Bicicletta;

public class Test {

	public static void main(String[] args) {
		List<Studente> listastudenti=new ArrayList<Studente>();
		Scanner input=new Scanner(System.in);
		int n =2;
		for(int i=0;i<n;i++) {
			Studente s=new Studente();
			System.out.println("Inserire nome");
			s.setNome(input.next());
			System.out.println("Inserire cognome");
			s.setCognome(input.next());
			System.out.println("Inserire matricola");
			s.setMatricola(input.next());
			listastudenti.add(s);
			List<Integer> listavoti=new ArrayList <Integer>();
			System.out.println("Inserire numero esami svolti");
			int esamiSvolti=input.nextInt();
				for(int a=0;a<esamiSvolti;a++) {	
					System.out.println("Inserire voto");
					int v=input.nextInt();
					listavoti.add(v);	
				}
			int somma=0,media=0;
				for(int a=0;a<listavoti.size();a++) {
				somma=listavoti.get(a)+somma;		
				}
			media=somma/esamiSvolti;
			s.setMedia(media);
			
			}
			double mediamax=listastudenti.get(0).getMedia();
			for(int b=0;b<listastudenti.size();b++) {
				if(mediamax<listastudenti.get(b).getMedia()) {
					mediamax=listastudenti.get(b).getMedia();
				}
			}
			System.out.println(mediamax);
	}	
	static int cont;
	public static String stringaPiulunga(String nomi[]) {
		int max=nomi[0].length();
		String stringalunga=nomi[0]; {	
		for(int i=0; i<nomi.length;i++) {
			if(nomi[i].length()>max) {
				max=nomi[i].length();
				stringalunga = nomi[i];
			}
		}
		return stringalunga;
		}
	}
	public static void insertVotiEsami(int votoesami[]) {	
		int votoesame;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<votoesami.length;i++){
			System.out.println("inserisci la valutazione del "+(i+1)+" esame");
			votoesame=input.nextInt();
			votoesami[i]=votoesame;
		}
	}
	public static int sommaEMedia(List<Studente>lista) {
		int media=0;
		int somma=0;
		for(int i=0;i<lista.size();i++) {
			somma=lista.size()+somma;
			media=somma/lista.size();
		}
		System.out.println(media);
		return media;
	}
	public static void insertString(String array[]) {	
		Scanner input=new Scanner(System.in);
		String nome;
		String[]arraynomi=new String[3];
		for(int i=0;i<arraynomi.length;i++) {
			nome=input.next();
			arraynomi[i]=nome;
		}	
		for(int i=0;i<arraynomi.length;i++) {
			if(arraynomi[i].charAt(0)>='a'&&arraynomi[i].charAt(0)<='h') {
				System.out.println(arraynomi[i]);
			}
		}
	}
	public static void calcolaMax(List<Persona> lista,int n) {
	int max=lista.get(0).getEta();
	for(int i=0; i<n;i++) {
		 if(lista.get(i).getEta()>max) {
			 max=lista.get(i).getEta(); 
		 }
	}
	System.out.println(max);
	}
	public static void calcolaMin(List<Persona> lista,int n) {
	int min=lista.get(0).getEta();
	for(int i=0; i<n;i++) {
		 if(lista.get(i).getEta()<min) {
			 min=lista.get(i).getEta(); 
		 }
	}
	System.out.println(min);
	}
	public static void stampaIdentità(List<Persona> lista) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println(lista.get(i).getCognome()+" "+lista.get(i).getNome());
		}
	}
}