#include <stdio.h>
#include <string.h>
int main()
{
	char c[8];
	char *a, *b, *res;
	gets(c);
	a = strtok(c, " ");
	b = strtok(NULL, " ");
	for(int i = 2; i >= 0; i--)
	{
		if(a[i] != b[i])
		{
			res = a[i] > b[i] ? a : b;
			break;
		}
	}
	for(int i = 2; i >= 0; i--)
		printf("%c", res[i]);
	return 0;
}