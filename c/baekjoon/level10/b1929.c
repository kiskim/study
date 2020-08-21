#include <stdio.h>
#include <stdbool.h>
#include <math.h>
bool is_prime(int n)
{
	bool res = n > 1 ? true : false;
	for (int i = 2; i <= sqrt(n); i++)
	{
		if(n % i == 0)
		{
			return false;
		}
	}
	return res;
}

int main(){
	int a, b;
	scanf("%d%d", &a, &b);
	for(int i = a; i <= b;i++)
		if(is_prime(i))
			printf("%d\n", i);
	return 0;
}