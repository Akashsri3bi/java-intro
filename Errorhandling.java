public class Errorhandling {

      public static void main(String[] args) {
            
      
      int count = 0;
      int x = 2 , y  =6 , z = 9 ;
      try{
      double avg = (x + y + z)/count ;
      System.out.println(avg);
      }catch(Exception e){
            System.out.println(e.toString());
      }
      }
}
