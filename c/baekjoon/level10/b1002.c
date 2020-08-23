#include <stdio.h>
#include <math.h>
int main(){
	int n;
	int x1, y1, r1, x2, y2, r2;
	int max_x, max_y, min_x, min_y;
	int res = 0;
	int d1 = 0, d2 = 0;
	scanf("%d", &n);
	while (n-- > 0)
	{
		scanf("%d%d%d%d%d%d", &x1, &y1, &r1, &x2, &y2, &r2);
		if(x1 < x2)
		{
			max_x = x1 + r1;
			min_x = x2 - r2;
		}
		else if (x2 < x1)
		{
			max_x = x2 + r2;
			min_x = x1 + r1;
		}
		
		if(y1 <= y2)
		{
			max_y = y1 + r1;
			min_y = y2 - r2;
		}
		else
		{
			max_y = y2 + r2;
			min_y = y1 - r1;
		}
		printf("%d %d\n", min_x, max_x);
		printf("%d %d\n", min_y, max_y);
		// if(max_x < min_x || max_y < min_y)
		// {
		// 	res = 0;
		// }
		// else
		// {
		// 	for(int i = min_x; i <= max_x; i++)
		// 	{
		// 		d1 = 0;
		// 		d2 = 0;
		// 		for(int j = min_y; j <= max_y; j++)
		// 		{
		// 			d1 = sqrt(pow(x1 > i ? x1 - i : i - x1, 2) + pow(y1 > j ? y1 - j : j - y1, 2));
		// 			d2 = sqrt(pow(x2 > i ? x2 - i : i - x2, 2) + pow(y2 > j ? y2 - j : j - y2, 2));
		// 			if(d1 <= r1 && d2 <= r2)
		// 				res++;
		// 		}
		// 	}
		// }
		// printf("%d\n", res);

	}
	return 0;
}