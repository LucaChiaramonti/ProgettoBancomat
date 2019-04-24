package testGrafico;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {
	
	private Button b=null;
	private Button b2=null;
	private Button b3=null;
	private TextField t=null;
	private TextField t1=null;
	private Label pin=null;
	private Label logo=null;
	int i=0;
	private ContoCorrente cc=null;
	
	public MyFrame(String titolo,ContoCorrente cc) {
		
		this.cc=cc;
		super(titolo);
		this.setLayout(null);
		setSize(600, 500);
		setVisible(true);
		setLocation(350,300);
		setBackground(Color.red);
		
		logo=new Label("Banca di Roma");
		logo.setBackground(Color.white);
		logo.setLocation(7, 40);
		logo.setSize(150,30);

		pin=new Label("INSERISCI PIN");
		pin.setBackground(Color.white);
		pin.setLocation(70, 200);
		pin.setSize(150,30);
		
		t=new TextField();
		t.setBackground(Color.white);
		t.setLocation(250, 200);
		t.setSize(70,30);
		
		t1=new TextField();
		t1.setBackground(Color.white);
		t1.setLocation(400, 200);
		t1.setSize(150,30);
		
		b=new Button("Exit");
		b.setBackground(Color.white);
		b.setLocation(470, 430);
		b.setSize(70,30);
		b.addActionListener(this);

		b3=new Button("OK");
		b3.setBackground(Color.white);
		b3.setLocation(250, 430);
		b3.setSize(70,30);
		b3.addActionListener(this);
		
		b2=new Button("Cancella");
		b2.setBackground(Color.white);
		b2.setLocation(30, 430);
		b2.setSize(70,30);
		b2.addActionListener(this);
		
		add(logo);
		add(pin);
		add(t);
		add(t1);
		add(b);
		add(b2);
		add(b3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(b))
		{
			System.exit(0);
		}
		
		if(e.getSource().equals(b2)) {
			t.setText("");
		}
		
		if(e.getSource().equals(b3)) {
				if(t.getText().equals(cc.getPin())) {
					
					System.exit(0);
				}
				else {
					this.t.setText("");
					i++;
					if(i==3) {
						System.exit(0);
					}
				}
				t1.setText("Hai ancora "+(3-i)+" tentativi");
				}
	}

	
}
		
		
	
	
	
		
	
	
	
	


	

