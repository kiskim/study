#include <stdio.h>

int main(){
	int a, b, c;
	int i = 0;
	scanf("%d %d %d", &a, &b, &c);
	if(b >= c)
	{
		printf("-1");
		return 0;
	}
	while(a + (b * i) >= c * i)
		i++;
	printf("%d", i);
	return 0;
}