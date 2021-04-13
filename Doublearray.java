import java.util.Scanner;

public class Doublearray {

      /**
       * 
       * Two Dimensional Array
       * @author Akash sri
       */
      
      public static void main(String[] args) {
            double[][] prices = new double[5][2];

            for(int i = 0 ; i < 5 ; i++){
                  System.out.println("Enter the original prices");
                  Scanner input = new Scanner(System.in);
                  prices[i][0] = input.nextDouble();

                  //Giving a discount of 30 percent so original price multiply by .70

                  prices[i][1] = prices[i][0] * .70 ;
            }

            for (int i = 0 ; i<5 ; i++){
                  System.out.println("the original; prices are $ " + prices[i][0] + 
                  "\t dicounted prices are $ " + prices[i][1] );
            }
      }
      
}
