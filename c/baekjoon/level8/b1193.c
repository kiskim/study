#include <stdio.h>

int main(){
	int a, line = 1;
	scanf("%d", &a);
	while(line < a)
	{
		a -= line;
		line++;
	}
	if(line % 2 == 0)
		printf("%d/%d", a, line + 1 - a);
	else
		printf("%d/%d", line + 1 - a, a);
	return 0;
}