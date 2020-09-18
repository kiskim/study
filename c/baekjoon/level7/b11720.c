#include <stdio.h>
#include <stdlib.h>
int main(){
	int n, res = 0;
	char *s;
	scanf("%d", &n);
	s = malloc(n);
	scanf("%s", s);
	for(int i = 0; i < n; i++)
		res += s[i] - '0';
	printf("%d", res);
	return 0;
}