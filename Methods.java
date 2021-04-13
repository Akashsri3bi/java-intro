import java.util.Scanner;

public class Methods {
      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("The average of three int numbers 3 , 5 , 8 is : " + average(3, 5, 8));
            System.out.println("The average of three int numbers 3.0 , 5.0 , 8.0 is : " + average(3.0, 5.0, 8.0));
      
      }

      public static double average(double num1 , double num2 , double num3){
            double avg  = ( num1 + num2 + num3 )/3 ;
            return avg;
      }

      public static double average(int num1 , int num2 , int num3){

            return (num1 + num2 + num3)/3.0;
      }
}
