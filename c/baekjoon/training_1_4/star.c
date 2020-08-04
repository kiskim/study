#include <stdio.h>

int main()
{
	int n;
	int count = 0;
	scanf("%d", &n);
	for(int i = 0; i < 2 * n - 1; i++){
		if(i < n)
			count++;
		else
			count--;
		for(int j = 0; j < count; j++)
			printf("*");
		printf("\n");
	}
	return 0;
}