import java.util.Arrays;
import java.util.Scanner;

public class Main{
      public static void main(String[] args) {

            int totalweeks = GettotalmealWeeks();
            double[] dailycost = new double[5];
            System.out.println("The values before filling array"  + Arrays.toString(dailycost));
            GetDailymealcost(dailycost);
            System.out.println("The values after filling array" + Arrays.toString(dailycost));
            double mealcost = computeMealCost(totalweeks, dailycost);
            printtotalmealplancost(mealcost);

            
      }

      public static int GettotalmealWeeks(){
            Scanner in = new Scanner(System.in);
            System.out.println("How many weeks are in  your Semester ? ");
            int totalmealweeks = in.nextInt();
            return totalmealweeks;
      }

      public static void GetDailymealcost(double[] dailycost){
            Scanner in = new Scanner(System.in);

            for (int i = 0 ; i < dailycost.length ; i++){

                  System.out.println("Enter the estimated cost for day " + (i+1));
                  dailycost[i] = in.nextDouble();

            }

      }

      public static double computeMealCost(int numweeks , double[] dailycost){

            double totalcost = 0  , weeklycost = 0;

            for (int i = 0 ; i < dailycost.length ; i++){
                  weeklycost += dailycost[i];

            }
            totalcost = weeklycost*numweeks;
            return totalcost;
      }

      public static void printtotalmealplancost(double total){
            System.out.printf("Your estimated total meal plan cost for the" + 
            "semster is $ %5.2f" , total);
            System.out.println();

      }



}