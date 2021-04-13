import java.util.Scanner;

public class New{

      public static double Totalcost(double listedmealprice , double tiprate , double taxrate )
      {
            double tip = tiprate * listedmealprice;
            double tax = taxrate * listedmealprice;
            double result = listedmealprice  + tip + tax;
            return result;

      }

      public static int Employeesalary(){
            System.out.println("Number of hours employee work");
            Scanner input = new Scanner(System.in);
            int hours = input.nextInt();
            System.out.println("Amount of money per hour");
            Scanner input2 = new Scanner(System.in);
            int money = input2.nextInt();
            System.out.println("Vacation days");
            Scanner input3 = new Scanner(System.in);
            int bonus = input3.nextInt();

            int grossyearlysalary = hours*money*52;
            int unpaidtime = bonus*money*8;
            return (grossyearlysalary) - unpaidtime;

      }

      public static void main(String args[]){

            int salary = Employeesalary();
            System.out.println(salary);

      }

}