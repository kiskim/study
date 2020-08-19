#include <stdio.h>

int solution(int n) {
	int res = 0;
	while(n >= 10)
	{
		res += n % 10;
		n /= 10;
	}
    return res + n;
}