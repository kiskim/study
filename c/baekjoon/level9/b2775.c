#include <stdio.h>
/*
	재귀로 해결했으나
	속도는 14x14 배열을 선언, 값을 채워서
	값을 꺼내는 방식이 더 빠름...
*/
int get_people(int k, int n)
{
	if(n == 1)
		return 1;
	if(k == 0)
		return n;
	return get_people(k, n - 1) + get_people(k - 1, n);
}

int main()
{
	int a;
	scanf("%d", &a);
	for(int i = 0; i < a; i++)
	{
		int k, n;
		scanf("%d%d", &k, &n);
		printf("%d\n", get_people(k, n));
	}
}