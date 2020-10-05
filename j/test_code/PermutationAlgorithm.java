package test_code;
/**
 * 순열 알고리즘 테스트
 */
public class PermutationAlgorithm {
	/**
	 * 1. Swap을 이용한 순열
	 * 순서 없이 n 개중 r개를 뽑는 경우
	 */
	public static void swapTest(int [] arr, int depth, int n, int r){
		if(depth == r){
			for(int a: arr)
				System.out.print(a+"");
			System.out.println();
			return;
		}
		for(int i = depth; i < n; i++)
		{
			swap(arr, depth, i);
			swapTest(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}
	public static void swap(int[] arr, int depth, int i)
	{
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
	/**
	 * 2. Visited 배열
	 * 
	 */
	static void visitedTest(int [] arr, int [] output, boolean[] visited, int depth, int n, int r){
		if(depth == r)
		{
			for(int i = 0; i < r;i++)
				System.out.print(output[i]);
			System.out.println();
			return ;
		}
		for(int i = 0; i < n; i++)
		{
			if(visited[i] != true)
			{
				visited[i] = true;
				output[depth] = arr[i];
				visitedTest(arr, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}
	}
	public static void main(String[] args) {
		int [] input = {1, 2, 3};
		swapTest(input, 0, 3, 3);
		System.out.println("------------------------");
		visitedTest(input, new int[3], new boolean[3], 0, 3, 2);
	}
}
