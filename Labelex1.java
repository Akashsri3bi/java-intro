import java.awt.event.* ;
import java.awt.* ; 
public class Labelex1 extends Frame implements ActionListener {
      TextField tf ; 
      Label l , l1 ;  
      Labelex1(){
            l1= new Label("Enter your ip") ;
            l1.setBounds(10,30, 250, 20); 
            tf = new TextField("Enter you desired site") ; 
            tf.setBounds(50, 50 ,150 , 20);
            l = new Label() ; 
            l.setBounds(50,100,250,20);
            Button b = new Button("Find Ip") ; 
            b.setBounds(50,150,60,30);
            b.addActionListener(this);
            add(l) ; add(tf) ; add(b) ; add(l1) ; 
            setSize(400,400);
            setLayout(null);
            setVisible(true) ; 

      }
      @Override
      public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try{
                  String host = tf.getText() ; 
                  l.setText("the ip for this " + host + "is: Fuck off");
            }catch(Exception ex){
                  System.out.println(ex);
            }
      }

      public static void main(String... args){
            Labelex1 li = new Labelex1() ; 
      }

}
