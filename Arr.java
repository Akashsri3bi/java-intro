import java.util.Scanner;

/**
 * 
 * @author Akash sri
 * 
 */

public class Arr {


//To create a grocery list
      public static void main(String[] args) {

            //Todo the code logic here

            /**double[] prices = new double[5];          //Creation of array.

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the five values of Grocery list");
            prices[0] = input.nextDouble();
            prices[1] = input.nextDouble();
            prices[2] = input.nextDouble();
            prices[3] = input.nextDouble();
            prices[4] = input.nextDouble();

            double total = prices[0] + prices[1] + prices[2] + prices[3] + prices[4] ; 

            System.out.printf("The total for all values is $ %5.2f" ,total);

            */

            //Data casting ... implicit and Explicit ..
            System.out.println((3 + 5 + 8) / 3); //gives int
            System.out.println((3 + 5 + 8)/3.0);   //gives double

            double volume = 4/3 * Math.PI * 10*10*10 ;
            double volume2 = 4 / 3.0 * Math.PI * 10 * 10 * 10;
            System.out.println(volume);
            System.out.println(volume2);

            double faherenhiet = 500;
            double celsius = (faherenhiet - 32) * 5 / 9.0;
            System.out.println(celsius);

            //To convert one data type to another .. we USe explicit method..
            int number;
            double variable;

            variable = 3.75;
            number = (int) variable;
            
      }
      
}
