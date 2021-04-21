public class Bubblesort {
      /**
       * Bubble sort program . 
       * @Author Akash Srivastava . 
       * 
       */
      public static void Bubblesorts(int[] arr){
            int temp ; 
            for (int i = 0 ; i < arr.length ; i++){
                  for (int j = i+1 ; j< arr.length ; j++){
                        if (arr[i] > arr[j]){
                              temp = arr[i] ; 
                              arr[i] = arr[j] ; 
                              arr[j] = temp ; 
                        }
                  }
            }
      }
      public static void main(String[] args) {
            int[] age = {12,11,13,15,10,9,18,17,20} ; 
            Bubblesorts(age);

            for (int i= 0 ; i < age.length ; i++){
                  System.out.print(age[i] + " ");
            }
      }
}
