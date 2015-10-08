import java.util.Arrays;

public class BinarySearch
 {
  public static void main(String... args) {
    int[] array = {9,8,7,6,5,4,3,2,1};
    BinarySearch binary= new BinarySearch();

    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    int pos = binary.search (array, 4);


    if( pos != -1 ){
      System.out.println("Element was found at position " + pos);
    }

  }


  public int search(int[] array, int elementToSearch) {
     int low=0;
     int high=array.length - 1;

     while(low <= high ){

      int mid = low + (high - low)/2;
      System.out.println("the mid is " + mid);

      if(elementToSearch > array[mid]) {
        low = mid  + 1;
      }
       else if (elementToSearch < array[mid])
       {
         high = mid - 1;
       }
      else
         return mid;
     }
     return -1;

  }
}
