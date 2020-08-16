#include <stdio.h>
#include <stdlib.h>
int main(){
	int a;
	int **l;
	scanf("%d", &a);
	for(int i = 0 ; i < a; i++)
	{
		int h, w, n;
		scanf("%d%d%d", &h, &w, &n);
		printf("%d%02d", (n - 1) % h + 1, (n - 1) / h + 1);
	}

	return 0;
}