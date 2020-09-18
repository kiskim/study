package programmers.level1.p21_hateSameNum;

import java.util.ArrayList;

public class Main {
    public int[] solution(int []arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int temp = -1;
		for(int a : arr)
			if(temp != a){
				list.add(a);
				temp = a;
			}
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
