#include <stdio.h>
#include <string.h>

int main(){
	char s[1000000];
	int a[26] = {0, };
	int i = 0, flag = 0;
	int max = 0;
	char index = 0;
	scanf("%s", s);
	while(s[i])
	{
		if(s[i] >='A' && s[i] <= 'Z')
			s[i] = s[i] + 32;
		i++;
	}
	i = 0;
	while(s[i])
		a[s[i++] - 'a'] += 1;
	for(int i = 0; i < 26; i++)
	{
		if(max < a[i])
		{
			flag = 0;
			max = a[i];
			index = (char)i;
		}
		else if(max == a[i])
			flag++;
	}
	printf("%c", (flag != 0 ? '?' : index + 'A'));
	return 0;
}