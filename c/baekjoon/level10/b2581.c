
#include <stdio.h>
#include <stdbool.h>

bool is_prime(int n)
{
	bool res = n > 1 ? true : false;
	for (int i = 2; i <= n / 2; i++)
	{
		if(n % i == 0)
		{
			return false;
		}
	}
	return res;
}

int main(){
	int m, n;
	int min;
	int res = 0;
	scanf("%d%d", &m, &n);
	min = n;
	for(int i = m; i <= n; i++)
	{
		if(is_prime(i))
		{
			res += i;
			min = min > i ? i : min;
		}
	}
	if(res == 0)
		printf("-1");
	else
	{
		printf("%d\n",res);
		printf("%d", min);
	}
	return 0;
}