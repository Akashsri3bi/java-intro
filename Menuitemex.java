import java.awt.* ; 
public class Menuitemex extends Frame{
      Menuitemex(){
            MenuBar mb = new MenuBar() ; 
            Menu menu = new Menu("Menu") ; 
            Menu submenu = new Menu("More") ; 
            MenuItem it1 = new MenuItem("XNXX") ; 
            MenuItem it2  = new MenuItem("Pornhub") ; 
            MenuItem it3 = new MenuItem("XVideos");
            MenuItem it4 = new MenuItem("NaughtyAmerica");
            MenuItem it5 = new MenuItem("Indianporn") ; 
            menu.add(it1) ; 
            menu.add(it2) ; 
            menu.add(it3);
            submenu.add(it4);
            submenu.add(it5);
            menu.add(submenu) ; 
            mb.add(menu) ; 
            setMenuBar(mb);
            setSize(400,400) ;
            setLayout(null) ; 
            setVisible(true) ;
      }
      public static void main(String[] args) {
            new Menuitemex() ; 
      }
}
