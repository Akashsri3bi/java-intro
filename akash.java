import java.util.Scanner;

public class akash {
      public static void main(String args[]){
            //Write a print statement asking questions.

            String Question = "What is the realname of iron man ";
            String choiceone = "Clark Kents";
            String choicetwo = "Tony Stark";
            String choicethree = "Peter Parker";

            String correctanswer = choicetwo;
            System.out.println(correctanswer);

            System.out.println(Question);

            System.out.println("Choose one of following." + choiceone + " " +  choicetwo + " " + choicethree);

            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();

            System.out.println(answer);

            if (correctanswer.equals(answer)){
                  System.out.println("Rigth answer");
            }else{
                  System.out.println("Wrong answer , right answer is "  + correctanswer);
            }
            
      }
}
