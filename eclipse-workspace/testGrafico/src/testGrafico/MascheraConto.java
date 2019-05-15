package testGrafico;

import java.awt.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MascheraConto extends Frame implements ActionListener{

	ContoCorrente cc;
	Label lp,ld,ls,lst,lb;           //l= label |	 p=prestito d=deposito s=saldo st=text "Saldo" b=banca
	TextField tp,td;                //tp=testo prelievo td=testo deposito 
	Button cd,cp,ad,ap,exit;       //C=conferma A=annulla D=deposito P=prelievo
	public MascheraConto(ContoCorrente cc){
	
		this.cc=cc;
		setLayout(null);
		setVisible(true);              //stabilisce se la finestra è visibile
		setSize(600,500);
		setLocation(350,300);
		setBackground(new Color (255,255,255));
		cd=new Button("Conferma");
		cd.setLocation(300,100);
		cd.setSize(70,30);
		add(cd);
		
		cp=new Button("Conferma");
		cp.setLocation(300,150);
		cp.setSize(70,30);
		add(cp);
		
		cp.addActionListener(this);
		cd.addActionListener(this);
		
		ad=new Button("Cancella");
		ad.setLocation(400,100);
		ad.setSize(70,30);
		add(ad);
		
		ad.addActionListener(this);
		ap=new Button("Cancella");
		ap.setLocation(400,150);
		ap.setSize(70,30);
		add(ap);
		
		ap.addActionListener(this);
		exit=new Button("EXIT");
		exit.setSize(40, 30);
		exit.setLocation(450,450);
		exit.addActionListener(this);
		add(exit);
		
		ls=new Label(cc.getSaldo().toString());
		ls.setLocation(500,30);
		ls.setSize(70, 40);
		add(ls);
		
		lst=new Label("Saldo:");
		lst.setLocation(450,30);
		lst.setSize(40, 40);
		add(lst);
		
		lp=new Label("Prelievo");
		lp.setLocation(50,150);
		lp.setSize(70, 40);
		add(lp);
		
		ld=new Label("Deposito");
		ld.setLocation(50,100);
		ld.setSize(70, 40);
		add(ld);
		
		lb=new Label("Banca di Roma");
		lb.setLocation(7,40);
		lb.setSize(150, 30);
		add(lb);
		
		tp=new TextField();
		tp.setText("0");
		tp.setSize(100,30);
		tp.setLocation(150,150);
		add(tp);
		
		td=new TextField();
		td.setText("0");
		td.setSize(100,30);
		td.setLocation(150,100);
		add(td);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		if(e.getSource()==cd)
		{
			cc.deposito(Integer.parseInt(td.getText()));
			ls.setText(cc.getSaldo().toString());
		}
		if(e.getSource()==cp)
		{
			cc.prelievo(Integer.parseInt(tp.getText()));
			ls.setText(cc.getSaldo().toString());
		}
		if(e.getSource()==ap)
		{
			tp.setText("0");
		}
		if(e.getSource()==ad)
		{
			td.setText("0");
		}	
	}
}
