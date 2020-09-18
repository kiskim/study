package programmers.level1.p19_divisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public int[] solution(int[] arr, int divisor) {
		int[] answer = null;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a : arr){
			if(a % divisor == 0)
				list.add(a);
		}
		if(list.size() != 0){
		answer = new int[list.size()];
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);
		}
		else{
			answer = new int[1];
			answer[0] = -1;
		}
        return answer;
	}
	
    public int[] solution2(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(factor -> factor % divisor ==0).toArray();
	}

}
