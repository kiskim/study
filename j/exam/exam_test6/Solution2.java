package exam.exam_test6;

public class Solution2 {
	
	public boolean check_func(int [] land, int x, int y)
	{	
		// 0	1   2   3
		// x1, y1, x2, y2
		if ((land[0] < x && land[2] > x
			& (land[1] < y && land[3] > y)))
				return true;
		return false;
	}
	
	public boolean solution(int [][] lands, int [][] wells, int [] point){
		for (int [] land : lands)
		{
			if (check_func(land, point[0], point[1]) || 
				check_func(land, point[2], point[3]) ||
				check_func(land, point[0], point[3]) ||
				check_func(land, point[2], point[1]))
				return false;
		}
		for (int [] well : wells)
		{
			if (check_func(point, well[0], well[1]) || 
				check_func(point, well[2], well[3]) ||
				check_func(point, well[0], well[3]) ||
				check_func(point, well[2], well[1]))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// int[][] lands = { {10, 0, 30, 5}, {0, 30, 20, 50}, {30, 30, 40, 40} };
		// int[][] wells = { {15, 15, 25, 25}, {40, 10, 50, 20}};
		// int[] point ={10, 10, 30, 30};

		int [][] lands = {{0, 0, 20, 10}, {10, 20, 20, 40}, {30, 0, 50, 20}};
		int [][] wells = { {20, 40, 30, 50}, {30, 20, 50, 30}};
		int [] point = {20, 30, 30, 40};
		
		Solution2 s = new Solution2();
		boolean b = s.solution(lands, wells, point);
		System.out.println(b ? "true" : "false");
	}
}
