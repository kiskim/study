#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(){
	int a;
	scanf("%d", &a);
	for(int i = 0; i < a; i++)
	{
		long long x, y, c = 0;
		scanf("%d%d", &x, &y);
		y = y - x;
		x = x - x;
		long long max;
		if (y < 4)
		{
			printf("%d\n", y);
			continue;
		}
		max = (long long)(sqrt(y));
		y = y - (max * max);
		if(y == 0)
		{
			printf("%d\n", max * 2 - 1);
			continue;
		}
		for(int j = max; j > 0; j--)
		{
			if(y / j > 0)
			{
				c+= y / j;
				y = y % j;
				j = y;
			}
		}
		c += max * 2 - 1;
		printf("%d\n", c);
	}
	return 0;
}