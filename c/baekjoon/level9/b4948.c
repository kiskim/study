#include <stdio.h>
#include <stdbool.h>
#include <math.h>
bool is_prime(int n)
{
	bool res = n > 1 ? true : false;
	for (int i = 2; i <= sqrt(n); i++)
	{
		if(n % i == 0)
		{
			return false;
		}
	}
	return res;
}

int main(){
	int a = 1, count;
	while(a != 0){
		scanf("%d", &a);
		count = 0;
		for(int i = a + 1; i <= 2 * a;i++)
			if(is_prime(i))
				count++;
		if(a != 0)printf("%d\n", count);
	}
	return 0;
}