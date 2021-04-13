import java.util.Scanner;

public class Expression {
      public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            double totalsale;
            totalsale = input.nextDouble();

            if (totalsale < 25)
            {
                  totalsale += 15;
            }
            else if(totalsale < 50)
            {
                  totalsale += 10;
            }
            else if ( totalsale <= 75)        //In python we write elif not else if .
            {
                  totalsale += 5;
            }
            System.out.println("Total sale price for this is " +  totalsale);

      }
}
