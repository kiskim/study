#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


int sum_num(int n) {
	int res = 0;
	while(n >= 10)
	{
		res += n % 10;
		n /= 10;
	}
    return res + n;
}
bool solution(int x) {
    bool answer = true;
	int sum = sum_num(x);
	answer = x % sum == 0 ? true : false;
    return answer;
}

int main(){
	printf("%d %d %d", sum_num(15), sum_num(8), sum_num(1234));
	return 0;
}