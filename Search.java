import java.util.ArrayList;
import java.util.Scanner;

public class Search {
      public static void main(String[] args) {
            //Binary Search 
            int[] numbers = {10 , 12 , 23 , 30 , 67 , 78 , 97 , 104 , 120};
            Scanner input = new Scanner(System.in);
            ArrayList<String> mls = new ArrayList<String>();
            mls.add("Coffee");
            mls.add("Banana");
            mls.add("Tea");
            mls.add("Milk");
            mls.add("Sugar");
            //BinarySearch(numbers , 0 , numbers.length , 30);

            String key = input.nextLine();
            LinearSearch(mls, key);
  
      }

      public static void BinarySearch(int[] numbers , int lowerbound , int upperbound , int key){


            int flag = 0;
            while (lowerbound<=upperbound){
                  int mid = (lowerbound + upperbound) / 2;
                  if (numbers[mid]== key){
                      System.out.println("Found at "  + mid);
                      flag = 1;
                      break;
                  }
                  else if(numbers[mid] < key)
                        lowerbound = mid + 1 ;

                  else if(numbers[mid] > key)
                        upperbound = mid - 1 ;
                     
            }
            if (flag==0)
                System.out.println("Not found");

      }
      
      public static void LinearSearch(ArrayList<String> xyz , String key){
            boolean found = false;
            for (int i = 0 ; i < xyz.size() ; i++){

                  if (key.equals(xyz.get(i)))
                  {
                        System.out.println("This item is already in list at " + i);
                        found = true;
                        break;
                  }
            }
            if (found == false){
                  System.out.println("Do you want to add this new item ?");
                  Scanner in  = new Scanner(System.in);
                  String answer = in.nextLine();
                  if (answer == "yes"){
                       xyz.add(key);
                       
                  }else if (answer == "no"){
                       System.out.print("OK NO PROBLEM");
                       System.out.print("Bye Take Care");
                  }
            }
                  //Make flag System to print the output for not found;;


                  
            }
      }


