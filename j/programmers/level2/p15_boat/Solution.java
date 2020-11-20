package programmers.level2.p15_boat;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
		int answer = 0;
		int front = 0, end = people.length - 1;
		Arrays.sort(people);
		while (front < end){
			if (people[end] + people[front] <= limit){
				front++;
				end--;
			}
			else{
				end--;
			}
			answer++;
		}
		if (front == end)
			answer++;
        return answer;
    }
}