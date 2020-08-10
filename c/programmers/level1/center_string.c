#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char* solution( char *s);
int main(){
	char *s[100];
	int center;
	scanf("%s", s);
	char *res = solution(s);
	printf("%s", res);

	return 0;
}

char* solution( char *s){
	char *answer;
	int center = strlen(s) / 2;
	if(strlen(s) % 2 == 0)
	{
		answer = malloc(sizeof(char) * 3);
		answer[1] = s[center];
		answer[0] = s[center - 1];
		answer[2] = '\0';
	}
	else
	{
		answer = malloc(sizeof(char) * 2);
		answer[0] = s[center];
		answer[1] = '\0';
	}
	return answer;
}