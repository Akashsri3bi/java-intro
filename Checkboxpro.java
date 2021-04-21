import java.awt.* ; 
import java.awt.event.*;

public class Checkboxpro{
      Checkboxpro(){
            Frame f = new Frame("Checkbox Example") ; 
            Label l = new Label();
            l.setAlignment(Label.CENTER);
            l.setSize(300,500);

            Checkbox checkbox = new Checkbox("C++");
            checkbox.setBounds(100, 100, 50, 50);


            Checkbox checkbox2 = new Checkbox("java"); // Checked checkbox which is denoted by true.
            checkbox2.setBounds(100, 150, 50, 50);

            checkbox.addItemListener(new ItemListener() {
                  public void itemStateChanged(ItemEvent e) {
                        l.setText("C++ Checkbox : " + (e.getStateChange() == 1? "checked" : "unchecked"));
                  }
            });

            checkbox2.addItemListener(new ItemListener(){
                  public void itemStateChanged(ItemEvent e){
                        l.setText("Java Checkbox : " + (e.getStateChange()==1? "checked":"unchecked"));
                  }
            });

            f.add(checkbox);f.add(checkbox2); f.add(l) ; 
            f.setLayout(null);   
            f.setSize(400,400);
            f.setVisible(true);

      }
      public static void main(String[] args) {
            new Checkboxpro() ;
      }
}
