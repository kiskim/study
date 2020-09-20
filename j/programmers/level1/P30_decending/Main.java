package programmers.level1.P30_decending;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public long solution(long n) {
		long answer = 0;
		ArrayList<Long> list = new ArrayList<>();
		while(n >= 10)
		{
			list.add(n % 10);
			n /= 10;
		}
		list.add(n);
		Collections.sort(list, Collections.reverseOrder());;
		for(long a : list)
			answer = answer * 10 + a;
        return answer;
    }
}
