#include <stdio.h>

int main(){
	int a, i = 1;
	int bf = 1, af = 7;
	scanf("%d", &a);
	if(a == 1)
	{
		printf("1");
		return 0;
	}
	while(!(bf < a && a <= af)){
		bf+= 6 * i;
		af+= 6 * (i + 1);
		i++;
	}
	
	printf("%d", i+1);
	return 0;
}