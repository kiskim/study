#include <stdio.h>

int main(){
	int a, res = 2000;
	scanf("%d", &a);
	for(int i = a / 5 + 1; i >= 0; i--)
	{
		for(int j = 0; j < a /3 + 1; j++)
		{
			if(5 * i + 3 * j == a)
				res = res > i + j ? i + j: res;
		}
	}
	res = res == 2000 ? -1 : res;
	printf("%d", res);
	return 0;
}