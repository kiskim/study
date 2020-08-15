#include <stdio.h>

int main(){
	int  a, b, c;
	int  i;
	int  res;
	scanf("%d %d %d", &a, &b, &c);
	i = c - b;
	if(i <= 0)
	{
		printf("-1");
		return 0;
	}
	res = (a / i) + 1;
	printf("%d", res);
	return 0;
}