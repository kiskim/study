#include <stdio.h>
#include <string.h>

int solution(char *s){
	int res = 0;
	int flag = 1;
	for(int i = 0; i < strlen(s); i++)
	{
		switch (s[i])
		{
		case '-':	flag *= -1; break;
		case '+':	break;
		default:
			res = res * 10 + s[i] - '0';
			break;
		}
	}
	return res * flag;
}

int main(){
	printf("%d\n", solution("-23"));
	printf("%d\n", solution("+3"));
	printf("%d\n", solution("43"));
	return 0;
}