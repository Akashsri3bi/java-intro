import java.util.Scanner;

public class DumpArgs {
      public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            int numberofstudents;

            double [] heights ;
            System.out.println("Enter number of students in class");
            numberofstudents = input.nextInt();
            heights = new double[numberofstudents];
            for (int i = 0 ; i < numberofstudents ; i++){
                  System.out.println("Enter the height : ");
                  heights[i] = input.nextDouble();
            }

            double maxheight = heights[0];
            for (int i = 1 ; i < heights.length ; i++){
                  if (maxheight < heights[i])                //we donot use a curly bracket if there is only one block of code in if statement
                        maxheight = heights[i];
                  
            }
            double total = 0;
            for ( int i  = 0 ; i < heights.length ; i++){
                  total += heights[i] ; 
            }

            System.out.println("the max height of student is  : "  + maxheight + 
            
            " \n and average of height of students is " + (total / numberofstudents) + " inches" );
      }
}