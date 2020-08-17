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

long long sumAtoB(long a, long b)
{
	return (b - a + 1) * (a + b) / 2;
}

long long solution2(int a, int b){
	int temp;
	if(a > b){
		temp = a;
		a = b;
		b = temp;
	}
	return sumAtoB(a, b);
}

int main()
{
	printf("%d\n", solution(3, 5));
	printf("%d\n", solution(5, 3));
	printf("%d\n", solution(3, 3));
	return 0;
}