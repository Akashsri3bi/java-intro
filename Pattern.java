public class Pattern {
      public static void main(String[] args) {
            int count = 10;
            for (int i = 1 ; i<=count ; i++){
                  for (int j = 2*(count - i) ; j >1  ; j--){
                        System.out.print(" ");
                  }
                  for (int k = 1 ; k <=i ; k++){
                        System.out.print("*");
                  }
                  System.out.println(); 
            }

      }

}
                  




