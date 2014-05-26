package testpositionnement;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
* Cette classe cr�e une fen�tre qui comporte deux boutons positionn�s � des
* coordonn�es absolues, sans faire appel � un layout manager.
*
*/
public class position {
   public static void main(String[] args) {
       // la cr�ation des objets graphiques est d�l�gu�e au thread de
       // diffusion d'�v�nements de Swing
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               // nouvelle fen�tre
               JFrame fenetre = new JFrame("NullLayout Demo");
               fenetre.setSize(new Dimension(500,500));
               List<JButton> buttons = new ArrayList<>();
               // pas de layout manager pour cette fen�tre :
               // on positionnera les composants � la min
              // fenetre.setLayout(null);
                
               // cr�ation des boutons
               //JButton b1 = new JButton("Un"), b2 = new JButton("Deux");
                
               for(int i = 1; i <= 36; i++) {
                   buttons.add(new JButton("Button-" + i));
               }
               
               // ajout des boutons � la fen�tre
              // fenetre.add(b1);
              // fenetre.add(b2);
               for(JButton button : buttons) {
            	   fenetre.add(button);
                 }
               // positionnement et dimensionnement manuel des boutons
             //  b1.setBounds(10, 10, 50, 50);
             //  b1.setIcon(new ImageIcon("c:/Users/user/workspace/testpositionnement/src/testpositionnement/images.jpg"));
             //  b2.setBounds(70, 10, 50, 50);
               //b1.setEnabled(false);;
                
               // quitter le programme lorsqu'on ferme la fen�tre
               fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
               // dimensionnement en affichage de la fen�tre
               fenetre.setSize(300, 200);
               fenetre.setVisible(true);
               
           }
            
       });
   }
}