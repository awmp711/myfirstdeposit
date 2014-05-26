package testpositionnement;

import javax.swing.SwingUtilities;
 
public class pos {
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
				view fenetre = new view();
				fenetre.ligne(1);
				
				fenetre.ligne(2);
				fenetre.ligne(3);
				fenetre.desactive(1, 5);
				fenetre.setVisible(true);//On la rend visible
			}
		});
	}
}