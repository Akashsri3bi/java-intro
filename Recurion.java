import javax.lang.model.element.Element;

public class Recurion {

      public static void main(String[] args) {
            conutdown(10);
      }

      public static void conutdown(int num){
            if(num==0)
            System.out.println("BLast off");
            
            else{
                  System.out.println(num);
                  conutdown(num - 1);
            }
      }
      
}
