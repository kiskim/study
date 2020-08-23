#include <stdio.h>
#include <math.h>
int main(){
	double pi = acos(-1);
	double r;
	scanf("%lf", &r);
	printf("%.6lf\n", pi * r * r);
	printf("%.6lf\n", 2 * r * r);
	return 0;
}