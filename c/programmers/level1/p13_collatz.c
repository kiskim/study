#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num) {
    int answer = 0;
	long long n = num;
	while(n != 1)
	{
		n = n % 2 == 0 ? n / 2 : (n * 3) + 1;
		answer++;
		if(answer > 500)
		{
			answer = -1;
			break;
		}
	}
    return answer;
}

int main(){
	printf("%d", solution(626331));
	return 0;
}
