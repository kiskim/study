#include <stdio.h>
#include <math.h>
void swap(long long *a,long long *b)
{
	long long temp;
	if(*a > *b)
	{
		temp = *a;
		*a = *b;
		*b = temp;
	}
}
int main(){
	long long a, b, c, temp;
	while(1){
		scanf("%u%u%u", &a, &b, &c);
		swap(&a, &b);
		swap(&b, &c);
		swap(&a, &c);
		if(a == 0 && b == 0 && c == 0)
			break;
		if(a*a + b*b == c*c)
			printf("right\n");
		else
			printf("wrong\n");
	}
	return 0;
}