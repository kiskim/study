#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
	int res = 0;
	for(int i = 1; i <= n / 2 ; i++)
		res += n % i == 0 ? i : 0;
    return res + n;
}

int main()
{
	printf("%d\n", solution(12));
	printf("%d\n", solution(28));
	printf("%d\n", solution(5));
	return 0;
}