import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * 
 * @author Akash srivastava
 * 
 */

public class Demo {

      public static void main(String args[]){
            double distance;
            double mpg;
            double pricepergallon;
            double Totalcost;
            int t;
            String vehicltype;


            Scanner input = new Scanner(System.in);

            System.out.println("Enter the number of testcase");
            t = input.nextInt();

            //Looping the statements
            for (int i = 0 ; i < t ; i++){

                  //strings are stored in Double quotes ..
                  //Char are stored in single quotes..

            System.out.println("Enter the total distance in miles");
            distance = input.nextDouble();

            System.out.println("Enter the price of one gallon of gas");
            pricepergallon = input.nextDouble();

            System.out.println("Enter the mpg of vehicle");
            mpg = input.nextDouble();


            System.out.println("Enter the type of vehicle");
            vehicltype = input.next();

            Totalcost = (distance/mpg)*pricepergallon;

            System.out.printf("The trip is going to cost $ %5.2f  since you are driving a " + vehicltype , Totalcost);
            System.out.println();

            
            }
      }
      
}
