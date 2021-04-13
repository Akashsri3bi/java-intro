import java.util.Scanner;
import java.util.ArrayList;

public class Lists {
      

      public static void main(String[] args) {
            
            ArrayList<Property> mls = new ArrayList<Property>() ; 
                     //This denotes the type of arraylist int , string or property our defined..
            Property p1 = new Property(10000, "Land", 3.1);
            mls.add(p1);
            p1 = new Property(20000, "Estate", 2.1,4, 5);
            mls.add(p1);
            //System.out.println(mls.toString());
            mls.remove(1);
            System.out.println(mls.toString());
      }
}
