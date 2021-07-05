
package Arrays;

class CheckRotateArray
{
  
  public static void rotateArray(int[] arr) {
    int lastElement = arr[arr.length - 1];

    for (int i = arr.length - 1; i > 0; i--) {

      arr[i] = arr[i - 1];
    }

    arr[0] = lastElement;
  } 

  public static void main(String args[]) {

    int[] arr = {3, 6, 1, 8, 4, 2};
    rotateArray(arr);

    System.out.print("Array after rotation: ");
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

} 