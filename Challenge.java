import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Challenge {
      public static void main(String[] args) {

            File menuitems = new File("Restaurant.txt");
            File menuprices = new File("Prices.txt");
            String menuitem;
            double Price;
            try{
                  Scanner input = new Scanner(menuitems);
                  PrintWriter out = new PrintWriter(menuprices);
                  Scanner in = new Scanner(System.in);

                  while (input.hasNextLine()){
                        menuitem = input.nextLine();
                        System.out.println("What is the price of : " + menuitem);
                        Price = in.nextDouble();
                        in.nextLine();
                        out.print(menuitem);
                        out.print("\t");
                        out.print(Price);
                        out.println();

                  }
                  out.close();

            }catch(Exception e){
                  System.out.println(e.toString());

            }

            
      }
}
