import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Customernames {

      public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            File output = new File("customer.txt");
            String name;
            System.out.println("Enter the first customer name");
            name = input.nextLine();
            try{
                  //This is used when writting to a file.
                  PrintWriter out = new PrintWriter(output);
                  while (name.equalsIgnoreCase("done")==false){
                        out.println(name);
                        System.out.println("Enter the next name");
                        name = input.nextLine();
                  }
                  //We should always close the file otherwise its contents will be in buffer and will be empty when opened.
                  out.close();
            }catch(Exception e){
                  System.out.println("Error encountered" + e.toString());

            }
      }
      
}
