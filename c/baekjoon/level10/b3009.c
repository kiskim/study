#include <stdio.h>
#include <stdbool.h>
int a[1001];
int b[1001];
int main()
{
	int list[3][2];
	for(int i = 0; i < 3; i++)
		scanf("%d%d", &list[i][0], &list[i][1]);
	for(int i = 0; i < 3; i++)
	{
		a[list[i][0]]++;
		b[list[i][1]]++;
	}
	int x, y;
	for(int i = 0; i < 1001; i++)
	{
		if(a[i] % 2 == 1)
			x = i;
		if(b[i] % 2 == 1)
			y = i;
	}
	printf("%d %d", x, y);
}