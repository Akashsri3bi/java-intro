import java.util.Scanner;

public class Tsa {

      
      public static void main(String[] args){

            double length;
            double height;
            double breadth;
            int doors;
            int windows;
            double size_doors;
            double size_windows;
            double gallonperarea;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter length of house");
            length = input.nextDouble();

            System.out.println("Enter breadth of house");
            breadth = input.nextDouble();

            System.out.println("Enter height of house");
            height = input.nextDouble();

            System.out.println("Enter number of doors in house");
            doors = input.nextInt();

            System.out.println("Enter number of windows in house");
            windows = input.nextInt();

            System.out.println("Enter size of doors house");
            size_doors = input.nextDouble();

            System.out.println("Enter size of windows house");
            size_windows = input.nextDouble();

            System.out.println("Enter gallon of paint per area");
            gallonperarea = input.nextDouble();

            double tsa = 2*(length*breadth + breadth*height);

            double area = (doors*size_doors + windows*size_windows );

            double new_area = (tsa - area);

            System.out.printf("The area to be painted is %5.2f " , new_area);
            System.out.println();
            System.out.printf("The amount of Gallon of paint is %5.2f" , new_area * gallonperarea);
            
      }
}
