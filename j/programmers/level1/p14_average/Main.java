package programmers.level1.p14_average;

public class Main {
    public static double solution(int[] arr) {
		double answer = 0;
		for(int i = 0 ; i < arr.length; i++)
			answer += arr[i];
		
        return answer / arr.length;
    }
}