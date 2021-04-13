public class Sorting {

      // Java program for implementation of Selection Sort
    public static void Selectionsort(int[] arr)
    {
        int n = arr.length;
        int temp;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void InsertionSort(int[] arr){

      for (int i = 1 ; i < arr.length  ; i++){

            int key =  arr[i];
            int j = i - 1;

            while(j>=0 && arr[j] > key){

                  arr[j + 1] = arr[j] ;
                  j = j - 1;
            }

            arr[j + 1] = key ;

      }

    }
      public static void main(String[] args) {
            int[] num = {2,4,5,8,12,11,9};
            InsertionSort(num);

            for (int i = 0 ; i < num.length ; i ++){
                  System.out.println("The Sorted numbers are" + num[i] + "\t");
            }


      }

}

