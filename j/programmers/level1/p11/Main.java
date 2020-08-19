package programmers.level1.p11;

public class Main {
    public long solution(long n) {
		long i = 0;
		while(i * i < n)
			i++;
        return i * i == n ? (i + 1) * (i + 1) : -1;
    }
}