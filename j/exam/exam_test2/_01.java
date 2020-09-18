package exam.exam_test2;

import java.util.HashMap;

public class _01 {
    public int solution(int[][] boxes) {
		HashMap<Integer, Integer> content = new HashMap<>();
		for(int [] box : boxes)
		{
			content.put(box[0], content.getOrDefault(box[0], 0)+ 1);
			content.put(box[1], content.getOrDefault(box[1], 0)+ 1);
		}
		int reminds = 0;
		int b = 0;
		for(int a : content.keySet()){
			reminds += content.get(a) % 2;
			b += content.get(a) / 2;
		}
        return reminds + b == boxes.length ? reminds : reminds / 2;
    }
}
