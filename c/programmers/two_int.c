#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


long long solution(int a, int b){
	long long res = 0;
	int temp;
	if(a > b){
		temp = a;
		a = b;
		b = temp;
	}
	for(int i = a; i < b + 1; i++)
		res += i;
	return res;
}

int main()
{
	printf("%d\n", solution(3, 5));
	printf("%d\n", solution(5, 3));
	printf("%d\n", solution(3, 3));
	return 0;
}