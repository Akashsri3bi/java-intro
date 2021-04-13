import java.util.Scanner;

public class Palindrome {

      public static void Palin(String Xyz){
            String reverse = "";
            int length = Xyz.length();

            for (int i = 0 ; i < length ; i++){

                  reverse = Xyz.charAt(i) + reverse;
            }

            if (Xyz.equals(reverse)){
                  System.out.print("IS a palindrome string");

            }else{
                  System.out.println("Not a palindrome string");
            }
      }
      public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);

             
            int number = in.nextInt();

            int temp = number;
            int reverse = 0;
            while (number > 0){
                  reverse = reverse*10 + number%10 ;
                  number = number/10 ; 
            }

            if (temp == reverse){
                  System.out.println("IS a Palindrome");
            }
            else{
                  System.out.println("Not a PAlindrome");
            }

            //When you want to take input in one line..
            //we write input files continously without break

            String name = in.nextLine();
            Palin(name);
      }
}
