package testpositionnement;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class view extends JFrame{
	private JPanel panel;
	 private List<JButton> buttons;	
	
	public view(){
		
		super();
		build();
		
	}
	
	public void build()
	{
       
		buttons= new ArrayList<>();
        panel = new JPanel();
         panel.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
         
       
        this.setContentPane(panel);
		
	}
	
	
	public void ligne(int ligne)
	{

		 for(int i = 1; i <= 10; i++) {
	      	  JButton b=new JButton("Button-" + i);
	      	  
	      	   b.setBounds(i*55,ligne*55,50,50);
	            buttons.add(b);
	            panel.add(b);
			
	        }
	        
	        this.setContentPane(panel);
		
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	public void desactive(int ligne, int pos)
	{
		
		for(int i = ((ligne-1)*10)+pos; i < (ligne*10); i++) {
		buttons.get(i).setEnabled(false);
		
		}
	}

}
