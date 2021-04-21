import java.awt.event.*;
import java.awt.* ; 
public class Popmenuex extends Frame{
      Popmenuex(){
            //It inherits menu class . 
            Frame f = new Frame("Popmenu example") ; 
            Label l = new Label() ; 
            l.setAlignment(Label.CENTER);
            l.setSize(400,100) ; 
            PopupMenu pop = new PopupMenu("Edit") ;
            MenuItem cut = new MenuItem("Cut") ; 
            cut.setActionCommand("Cut"); 
            MenuItem copy = new MenuItem("Copy");
            copy.setActionCommand("Copy");
            MenuItem paste = new MenuItem("Paste");
            paste.setActionCommand("Paste");
            pop.add(paste) ; 
            pop.add(copy) ; 
            pop.add(cut) ; 
            f.addMouseListener(new MouseAdapter(){
                  public void mouseClicked(MouseEvent event){
                        pop.show(f , event.getX() , event.getY());
                        l.setText("Item selected");

                  }
            });
            f.add(pop) ; f.setSize(400,400) ; f.setLayout(null); f.setVisible(true) ; 
            f.add(l) ; 

      }
      public static void main(String[] args) {
            new Popmenuex() ; 
      }
}
