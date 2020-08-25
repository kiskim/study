#include <stdio.h>

int fibonacci(int n)
{
	if(n < 0)
		return -1;
	else if(n == 0 || n == 1)
		return n;
	else
		return fibonacci(n - 2) + fibonacci(n - 1); 
}
int main(){
	int a;
	scanf("%d", &a);
	printf("%d", fibonacci(a));
}