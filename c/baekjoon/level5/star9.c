#include <stdio.h>

int main()
{
	int n, sp = 0, stars;
	scanf("%d", &n);
	stars = n * 2 - 1;
	for(int i = 0; i < n * 2 - 1; i++)
	{
		for(int j = 0; j < sp; j++)
			printf(" ");
		for(int j = 0; j < stars; j++)
			printf("*");
		stars = i < n - 1 ? stars - 2 : stars + 2;
		sp = i < n - 1 ? sp + 1 : sp - 1;
		printf("\n");
	}
	return 0;
}
