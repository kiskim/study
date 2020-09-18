#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){
	int n;
	int res = 0;
	char s[100];
	scanf("%d", &n);
	for(int i = 0; i < n; i++){
		int a[26];
		int flag = 1;
		for(int j = 0; j < 26; j++)
			a[j] = -1;
		scanf("%s", s);
		for(int j = 0; j < strlen(s); j++)
		{
			if((j - a[s[j] - 'a'] == 1 &&  a[s[j] - 'a'] != -1) || a[s[j] - 'a'] == -1)
				a[s[j] - 'a'] = j;
			else
				flag = 0;
		}
		if(flag == 1)
			res++;
	}
	printf("%d", res);
	return 0;
}