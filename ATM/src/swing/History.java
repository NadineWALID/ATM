package swing;

import javax.swing.JOptionPane;

public class History {
	  public int j=0;
	  public int count=0;
	  //to count both presses made by previous and next
	  public String[] transactions=new String[50];

	  
	  public  int storeTransaction(int b,float m)
		{   
	        

	     if (b==1)
			{
				j++;
	    	    transactions[j]="You made a deposit equal to LE "+m;
				
			}
			if (b==2)
				{j++;
				transactions[j]="You made a withdraw equal to LE"+m;
	}
				
			if (j==5)
			{
				transactions[1]=transactions[2];
				transactions[2]=transactions[3];
				transactions[3]=transactions[4];
				transactions[4]=transactions[5];
				j=4;
			}
				
			return j;
		}
	  
	  
				
	
		public void previousB() {
			if (j>0)
   		 count++;
   	 
   	 
   	 transactions[0]="No Transactions were made yet";
		 
		 int m = 0;

       if (count==0 || count==1)
		     m=j;

       if (count==2)
			    m=j-1;
       if (count==3)
				 m=j-2;
       if (count==4)
		     m=j-3;
       if (count==5)
			 m=j-4;
       if (count>=6)
       	 m=0;
		     
       	
       	JOptionPane.showMessageDialog(null, ""+transactions[m],"Previous Transaction",JOptionPane.PLAIN_MESSAGE);
       
		
		}
		
		
    
		public void nextB() {
			
			if (count>0)
        	    count--;
        	transactions[5]="No following transactions";
			transactions[0]="No Transactions were made yet";
			
			
			 
			 int m = 0;

            if (count ==0)
            	m=5;
			if ( count==1)
			     m=j;

            if (count==2)
				    m=j-1;
            if (count==3)
					 m=j-2;
            if (count==4)
				     m=j-3;
            if (count==5)
					 m=j-4;
            if (count>=6)
            	 m=0;
				     
            	
            	JOptionPane.showMessageDialog(null, ""+transactions[m],"Previous Transaction",JOptionPane.PLAIN_MESSAGE);
            
		
			
			
			
		}
			
			
			
			
			


		
			
	
	    
}
