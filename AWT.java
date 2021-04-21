import java.awt.*  ;

public class AWT extends Frame{
      AWT() {
 
            Button b = new Button("click me") ; 
            b.setBounds(30,50,80,30);
            add(b) ; 
            setSize(300 , 300);
            setLayout(null) ; 
            setVisible(true);
            

      }
      public static void main(String[] args) {
            AWT f = new AWT() ; 
      }
}
