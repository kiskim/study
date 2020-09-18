#include <stdio.h>
#include <math.h>

int get_d(int x1,int y1,int x2,int y2)
{
	return sqrt(pow(x1 - x2, 2)+pow(y1 - y2, 2));
}
void swap(float *a, float *b)
{
	float temp = *a;
	*a = *b;
	*b = temp;
}

int main(){
	int n;
	float x1, y1, r1, x2, y2, r2;
	float d = 0;
	float add, sub;
	scanf("%d", &n);
	while (n-- > 0)
	{
		scanf("%f%f%f%f%f%f", &x1, &y1, &r1, &x2, &y2, &r2);
		if(r1 > r2)
			swap(&r1, &r2);
		d = get_d(x1, y1, x2, y2);
		add = abs(r2) + abs(r1);
		sub = abs(r2) - abs(r1);
		if(d == 0)
		{
			if(r1 == r2)
				printf("-1");
			else
				printf("0");
		}
		else if(sub == d || add == d)
			printf("1");
		else if(add > d && sub < d)
			printf("2");
		else if(add < d || sub > d)
			printf("0");

		printf("\n");
	}
	return 0;
}