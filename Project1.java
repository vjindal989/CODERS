import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class project1 extends JFrame implements ActionListener{
	
	
	JPanel p;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField f1,f2,f3,f4,f5,f6,f7;
	JButton btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	
	String s1,s2,s3,s4,s5,s6,s7;
	
	public project1() {
		
		p = new JPanel(null);
		l1 = new JLabel("ID");
		l2 = new JLabel("NAME");
		l3 = new JLabel("COURSE");
		l4 = new JLabel("CONTACT");
		l5 = new JLabel("TOTAL FEE");
		l6 = new JLabel("PAID FEE");
		l7 = new JLabel("PENDING");
		f1 = new JTextField();
		f2 = new JTextField();
		f3 = new JTextField();
		f4 = new JTextField();
		f5 = new JTextField();
		f6 = new JTextField();
		f7 = new JTextField();
		btn1 = new JButton("SAVE");
		btn2 = new JButton("DELETE");
		btn3 = new JButton("UPDATE");
		btn4 = new JButton("SEARCH");
		btn5 = new JButton("PREVIOUS");
		btn6 = new JButton("SHOW");
		btn7 = new JButton("NEXT");
		btn8 = new JButton("SHOW ALL");
		btn9 = new JButton("CLEAR");
		
		l1.setBounds(20, 20, 100, 30);
		l2.setBounds(20, 40, 100, 30);
		l3.setBounds(20, 60, 100, 30);
		l4.setBounds(20, 80, 100, 30);
		l5.setBounds(20, 100, 100, 30);
		l6.setBounds(20, 120, 100, 30);
		l7.setBounds(20, 140, 100, 30);
		f1.setBounds(150, 20, 100, 20);
		f2.setBounds(150, 40, 100, 20);
		f3.setBounds(150, 60, 100, 20);
		f4.setBounds(150, 80, 100, 20);
		f5.setBounds(150, 100, 100, 20);
		f6.setBounds(150, 120, 100, 20);
		f7.setBounds(150, 140, 100, 20);
		btn1.setBounds(20, 180, 100, 30);
		btn2.setBounds(300, 180, 100, 30);
		btn3.setBounds(20, 220, 100, 30);
		btn4.setBounds(300, 220, 100, 30);
		btn5.setBounds(20, 260, 100, 30);
		btn6.setBounds(150, 260, 100, 30);
		btn7.setBounds(300, 260, 100, 30);
		btn8.setBounds(150, 300, 100, 30);
		btn9.setBounds(150, 340, 100, 30);
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l6);
		p.add(l7);
		
		p.add(f1);
		p.add(f2);
		p.add(f3);
		p.add(f4);
		p.add(f5);
		p.add(f6);
		p.add(f7);
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		p.add(btn8);
		p.add(btn9);
		
		
		add(p);
		setSize(500, 500);
		setTitle("MY FIRST PROJECT");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		
}
	
	public static void main(String[] args)
	{
		project1 f = new project1();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
	
		if(ae.getSource().equals(btn1)) {
			
			s1 = f1.getText();
			s2 = f2.getText();
			s3 = f3.getText();
			s4 = f4.getText();
			s5 = f5.getText();
			s6 = f6.getText();
			s7 = f7.getText();
			
			
			System.out.println("ID: "  +s1);
			System.out.println("NAME: " +s2);
			System.out.println("COURSE: " +s3);
			System.out.println("CONTACT: " +s4);
			System.out.println("TOTAL FEE: " +s5);
			System.out.println("PAID FEE:"  +s6);
			System.out.println("PENDING: " +s7);
			
		}
		
		else if(ae.getSource().equals(btn2)) {
			
			f1.setText("Welcome");
		}
	}
}
