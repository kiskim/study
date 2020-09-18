#include <stdio.h>

int main(){
	int a, b, v;
	scanf("%d%d%d", &a, &b, &v);
	int res =  (v - b) / (a - b);
	if((v - b) % (a - b) > 0)
		res++;
	printf("%d",res);
	return 0;
}