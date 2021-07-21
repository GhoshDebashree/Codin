package Algorithms;
public class MergeSort{

public static void merge(int Arr[], int start, int mid, int end){


	int temp[] = new int[end - start + 1];
	int i = start;
  int j = mid+1;
  int k = 0;

	
	while(i <= mid && j <= end) {
		if(Arr[i] <= Arr[j]) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}
		else {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}
	}

	// add elements left in the first interval 
	while(i <= mid) {
		temp[k] = Arr[i];
		k += 1; i += 1;
	}

	// add elements left in the second interval 
	while(j <= end) {
		temp[k] = Arr[j];
		k += 1; j += 1;
	}

	// copy temp to original interval
	for(i = start; i <= end; i += 1) {
		Arr[i] = temp[i - start];
	}
}

// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr

public static void mergeSort(int Arr[], int start, int end) {

	if(start < end) {
		int mid = (start + end) / 2;
		mergeSort(Arr, start, mid);
		mergeSort(Arr, mid+1, end);
		merge(Arr, start, mid, end);
	}
}
public static void printArray(int[] array){
  for(int i =0; i< array.length;i++){
    System.out.println(array[i]);
  }
}

public static void main(String[] args) {
  int[] array = {5,3,7,2,9,-1,0,-2,10};
  int start = 0;
  int end = array.length -1;
  mergeSort(array,start,end);
  printArray(array);
}
}
