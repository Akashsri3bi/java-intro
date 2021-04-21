import java.awt.* ; 

public class Canvasex extends Frame{  //Canvas inherits its properties from Component class . 

      public Canvasex(){
            add(new MyCanvas()) ; 
            setLayout(null);
            setSize(400,400) ; 
            setVisible(true) ;  
      }
      public static void main(String[] args) {
            new Canvasex() ; 
      }
}

class MyCanvas extends Canvas{
      public MyCanvas(){
            setBackground(Color.GRAY);
            setSize(400,400) ; 
      }
      public void paint(Graphics g){    //The graphics abstract base class allows graphics to be drawn.
            g.setColor(Color.red);
            g.fillOval(75, 75,150, 75);
            g.setColor(Color.blue);
            g.drawString("Welcome" , 50 ,50) ;
      }
}

