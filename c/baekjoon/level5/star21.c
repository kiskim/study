#include <stdio.h>

int main()
{
	int n, line, flag = 0;
	scanf("%d", &n);
	line = n != 1 ? n * 2 : 1;
	for(int i = 0; i < line; i++)
	{
		for(int j = 0; j < n; j++)
			printf("%c", (j % 2 == flag ? '*' : ' '));
		flag = flag == 1 ? 0 : 1;
		printf("\n");
	}
	return 0;
}
