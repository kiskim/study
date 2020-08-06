#include <stdio.h>
#include <string.h>
int main(){
	char c[8][4] = {"c=", "c-",  "d-", "lj", "nj", "s=", "dz=", "z="};
	char in[100];
	char *ptr;
	int n[8] = {0, };
	int res = 0;
	gets(in);
	for (int i = 0; i < 8; i++)
	{
		ptr = strstr(in, c[i]);
		while(ptr != NULL){
			n[i]++;
			ptr++;
			ptr = strstr(ptr, c[i]);
		}
	}
	n[7] -= n[6];
	for(int i = 0; i < 7; i++)
	{
		res += n[i] * strlen(c[i]);
	}
	printf("%d", res);
	return 0;
}