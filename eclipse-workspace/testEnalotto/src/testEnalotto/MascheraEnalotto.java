package testEnalotto;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MascheraEnalotto extends Frame implements ActionListener{
	Label tit,nv,punti;
	Button b,exit;
	private TextField t,t2,t3,t4,t5,t6;
	public MascheraEnalotto(String titolo){
		super(titolo);
		this.setLayout(null);
		setSize(600,500);
		setVisible(true);
		setBackground(Color.white);
		b=new Button("GIOCA");
		b.setSize(70,50);
		b.setLocation(300,300);
		b.addActionListener(this);
		add(b);
		exit=new Button("EXIT");
		exit.setSize(40, 30);
		exit.setLocation(450,450);
		exit.addActionListener(this);
		add(exit);
		tit=new Label("SuperEnalotto");
		tit.setSize(100,100);tit.setLocation(100,100);
		add(tit);
		punti=new Label("Numeri azzeccati:");
		punti.setSize(100,150);punti.setLocation(10,400);
		add(punti);
		nv=new Label("Sestina vincente:");                 //nv=numeri vincenti
		nv.setSize(200,150);nv.setLocation(300,50);
		add(nv);
		t=new TextField();t2=new TextField();t3=new TextField();t4=new TextField();t5=new TextField();t6=new TextField();
		t.setSize(30,30);t2.setSize(30,30);t3.setSize(30,30);t4.setSize(30,30);t5.setSize(30,30);t6.setSize(30,30);
		t.setLocation(200,200);t2.setLocation(250,200);t3.setLocation(300, 200);t4.setLocation(350,200);t5.setLocation(400,200);t6.setLocation(450,200);
		t.setBackground(Color.yellow);t2.setBackground(Color.yellow);t3.setBackground(Color.yellow);t4.setBackground(Color.yellow);t5.setBackground(Color.yellow);t6.setBackground(Color.yellow);
		add(t);add(t2);add(t3);add(t4);add(t5);add(t6);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(exit))
		{
			System.exit(0);
		}
		if(e.getSource().equals(b))
		{
			
		}
	}
}
