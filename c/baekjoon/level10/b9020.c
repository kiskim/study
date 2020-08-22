#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int a[10001];
void set_prime()
{
	a[0] = 1;
	a[1] = 1;
	for(int i = 2; i < 10001; i++)
	{
		for(int j = i * 2; j < 10001; j+=i)
			a[j] = 1;	
	}
}
int main(){
	int n, x, y, c;
	int  min;
	set_prime();
	scanf("%d", &c);
	while (c-- > 0)
	{
		scanf("%d", &n);
		min = n;
		x = 0;
		y = 0;
		for(int i = 2; i <= n / 2; i++)
		{
			if(a[i] == 0 && a[n - i] == 0)
			{
				if(min > abs(i - (n - i)))
				{
					x = i;
					y = n - i;
					min = abs(i - (n - i));
				}
			}
		}
		printf("%d %d\n", x, y);
	}
	return 0;
}