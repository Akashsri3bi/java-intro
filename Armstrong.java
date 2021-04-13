import java.util.Scanner;

public class Armstrong {
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();

            int sum = 0 ;
            while (number > 0){
                  sum = sum  + (number%10)* (number % 10)* (number % 10) ;
                  number = number / 10 ;

            }

            System.out.println(sum);
      }
}
