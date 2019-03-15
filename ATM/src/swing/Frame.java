package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;







public class Frame extends JFrame {
	public TextField deposite;
	public TextField withdraw;
	public JButton button,button2,button3,button4,button5;
	String amount;
	Main s= new Main();
	client c=new client();
    float money;
    History h=new History();




    
  
 public Frame(String title) {
			
			super("ATM");
			//to name the frame
			
			
			setLayout(new BorderLayout());
			//to set layout of string
			//JTextArea textarea=new JTextArea();
			button=new JButton("Deposite");
			button2=new JButton("Withdraw");
			button3=new JButton("Balance Inquiry");
			button4=new JButton("Previous");
			button5=new JButton("Next");
	        int i=0;

			while (i<=2)
			{
			
			
			
			
			
			
			String num=JOptionPane.showInputDialog("Please enter validation number(which is set by main to be equal to 5530)");
			int VN=Integer.parseInt(num);
			//to convert string taken from user into an integer
			
			s.setstuff(c);
			
			if (VN==c.getValidationNumber())
			{    
			
			    i=10;
				JPanel panel=new JPanel();
				getContentPane().add(panel);
				JLabel text1=new JLabel("Hello!Please choose what you want to do with your account");
				//panel.add(text1);
			//Container c= getContentPane();
			 //Container c= getContentPane();
				panel.setLayout(null);
				
				text1.setBounds(400,50,400,50);
				button.setBounds(100,50,100,50);
                button2.setBounds(100,50,100,50);
				button3.setBounds(200,50,200,50);
				button4.setBounds(100,50,100,50);
				button5.setBounds(100,50,100,50);
				
				
				text1.setLocation(30,10);
				button.setLocation(100,100);
				button4.setLocation(100,175);
				button2.setLocation(200,100);
				button5.setLocation(200,175);
				button3.setLocation(100,250);
				panel.add(text1);
				panel.add(button);
				panel.add(button2);
				panel.add(button3);
				panel.add(button4);
				panel.add(button5);
				

				 
				 
				button.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			        	  h.count=0;
			        	 amount=JOptionPane.showInputDialog("Enter number you want to deposite");
						 money=Integer.parseInt(amount);
						 c.setBalance(c.getBalance()+money);
						 JOptionPane.showMessageDialog(null, "Your balance is now = "+c.getBalance(),"deposite",JOptionPane.PLAIN_MESSAGE);
						 h.storeTransaction(1,money);
			        
			           
			         }     
				});
				
				
				
				button2.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			        	  
			        	 h.count=0;
			        	 amount=JOptionPane.showInputDialog("Enter number you want to withdraw");
						 money=Integer.parseInt(amount);
						 if (money<c.getBalance())
						 {
						 c.setBalance(c.getBalance()-money);
						 JOptionPane.showMessageDialog(null, "Your balance is now = LE"+c.getBalance(),"Withdraw",JOptionPane.PLAIN_MESSAGE);
						 h.storeTransaction(2,money);
						 
						 }
						 else 
						 {
							 JOptionPane.showMessageDialog(null, "No enough money to withdraw "+money,"Error",JOptionPane.PLAIN_MESSAGE);
						 }
			           
			         }     
				});
				
				
				button3.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			        	  
						 JOptionPane.showMessageDialog(null, "Your balance is = "+c.getBalance(),"Inquirey",JOptionPane.PLAIN_MESSAGE);
			           
			         }     
				});
				
				button4.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			        	  
			        	 h.previousB();
			         }
				});
				button5.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			        	  
                        h.nextB();

			         }     
				});
				
				
			}
			else
				{JOptionPane.showMessageDialog(null, "You entered a wrong validation number","ERROR",JOptionPane.PLAIN_MESSAGE);
				i++;
				}
			
			
		};
		if (i==3)
			{JLabel text2=new JLabel("You exceeded number of traials");
			JLabel text3=new JLabel("Please contact the bank to reactivate your card");
			JPanel panel=new JPanel();
			getContentPane().add(panel);
			panel.add(text2);
			panel.add(text3);
			// this will appear when a person enters validation number wrong 3 times
			
			}
			
		    
			
	}
    
 


	}








	
  