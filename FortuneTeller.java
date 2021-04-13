import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.xml.validation.SchemaFactoryLoader;

public class FortuneTeller {

      public static void main(String[] args) {

            File inputFile = new File("answers.txt");
            ArrayList<String> answers = new ArrayList<String>();
            String answer , response = "y" ; 
            Random rand = new Random();
            try{
                  Scanner input = new Scanner(inputFile);
                  while (input.hasNext()){
                        answer = input.nextLine();
                        answers.add(answer);
                  }
            }
            catch(Exception e){
                  System.out.println("The file not found");
                  System.out.println(e.toString());
            }

            Scanner in = new Scanner(System.in);
            while (response.equals("y")){
                  System.out.println("The fortune teller is ready for you \n " + "Please think about your Question \n"
                   + "hit enter for reply \n");

                  in.nextLine();
                  System.out.println("The Fortune teller says : \"" + answers.get(rand.nextInt(answers.size())) + "\n");
                  System.out.println("Do you have any other Question (y/n)");
                  response = in.nextLine();
            }


      }
      
}
