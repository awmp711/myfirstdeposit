package testpositionnement;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class seriebouton extends JPanel implements ActionListener {  
   private JButton trace = new JButton("trace");
   private JButton efface = new JButton("efface");
  private List<JButton> buttons = new ArrayList<>();
  // private Ardoise  ardoise = new Ardoise();

   public seriebouton() {

     // setLayout(new BorderLayout(5, 5));
      JPanel lesBoutons = new JPanel();

      for(int i = 1; i <= 2; i++) {
    	  JButton b=new JButton("Button-" + i);
    	  b.setLocation(25,40);
    	  
          buttons.add(b);
          
      }
      
      lesBoutons.setPreferredSize(new Dimension(500,500));
      //lesBoutons.add(trace);
     // lesBoutons.add(efface);
      for(JButton button : buttons) {
   	   lesBoutons.add(button);
        }
      add(lesBoutons, BorderLayout.NORTH);
     // add(ardoise, BorderLayout.CENTER);
      trace.addActionListener(this);
      efface.addActionListener(this);
  }

   public void actionPerformed(ActionEvent e) {
      //if (e.getSource() == trace) ardoise.setPossedeDisque(true);
     // else if (e.getSource() == efface) ardoise.setPossedeDisque(false);
    //  ardoise.repaint();      
   }

   public static void main(String[] arg) {
      JFrame monCadre = new JFrame();
      monCadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      monCadre.setLocation(500,500);
      monCadre.setLocationRelativeTo(null);
      monCadre.setContentPane(new seriebouton());
      monCadre.pack();
      monCadre.setVisible(true);
  }
}