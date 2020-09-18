#include <stdio.h>
#include <string.h>
int main(){
	char s[16];
	int res = 0, i = 0, j;
	char d[8][5] = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
	gets(s);
	while(s[i])
	{
		for(j = 0; j < 8; j++)
		{
			if(strchr(d[j], s[i]) != NULL)
				break;
		}
		res += j + 3;
		i++;
	}
	printf("%d", res);
	return 0;
}