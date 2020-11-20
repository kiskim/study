package test_code;

public class SelectionSort {
	public int[] selectionSort(int [] arr){
		int max = -1;
		int idx = -1;
		int last_idx = arr.length - 1;
		for(int i = last_idx; i >= 0; i-- ){
			for(int j = 0; j <= i; j++){
				if (max < arr[j]){
					max = arr[j];
					idx = j;
				}
			}
			if (max > arr[i]){
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
			}
			max = -1;
			idx = -1;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arr = {123,34,644,34,345,23,7865,3445};
		arr = new SelectionSort().selectionSort(arr);
		for(int a: arr)
			System.out.println(Integer.toString(a));
	}
}
