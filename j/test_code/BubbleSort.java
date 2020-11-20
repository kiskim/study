package test_code;

public class BubbleSort {
	public int[] bubbleSort(int [] arr){
		int max = arr.length;
		int temp = 0;
		for(int j = max - 1; j >= 0; j--){
			for(int i = 0; i < j; i++){
				if(arr[i] > arr[i + 1]){
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] arr = {123,34,644,34,345,23,7865,3445};
		arr = new BubbleSort().bubbleSort(arr);
		for(int a: arr)
			System.out.println(Integer.toString(a));
	}
}
