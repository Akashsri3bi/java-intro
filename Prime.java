import java.util.Scanner;

public class Prime {

      /**
       * Prime numers
       * @author AKAsh SRI
       */
      public static void main(String[] args) {
            int i , m , flag = 0;
            Scanner n = new Scanner(System.in);
            int number = n.nextInt();

            m = number/2;

            if (number==0 || number==1){
                  System.out.println("NOT A PRIME NUMBER");

            }else{

                  for (i = 2 ; i <=m ; i++){
                        if (number%i==0){
                              System.out.println("NOT  A PRime");
                              flag = 1;
                              break;
                        }
                  }
            }
            if (flag == 0){System.out.println("IS a Prime number");}

      }
}
