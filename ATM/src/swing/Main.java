package swing;
import javax.swing.JFrame ;
import javax.swing.SwingUtilities;



public class Main {

	client c=new client();

	
	

	public void setstuff(client c) {
		
		this.c = c;
		c.setValidationNumber(5530);
		c.setBalance(5000);
		c.setName("Nadine Walid");

		
	}




	public static void main(String[] args) {
		
		

		SwingUtilities.invokeLater(new Runnable() {
				public void run() {
		JFrame frame= new Frame("ATM");
		frame.setSize(400,400);
		//setting size of frame(width,height)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//for the program to be terminated when closing the frame
		frame.setVisible(true);
         //for frame to be visible
		
		
		
		}
		});

         

		}


	
	
	
	



	

}
