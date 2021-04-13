import java.util.Random;

public class Randoms{

      public static void main(String[] args) {
            int die1 , die2 , count = 0;
            Random rand = new Random();
            for (int i = 0 ; i < 100 ; i++){
                  
                  die1 = rand.nextInt(6);
                  die2 = rand.nextInt(6);

                  if (die1 == die2){
                        count++;
                  }
            }

            System.out.println("The number of times i rolled die is " + count);
      }
      
}
