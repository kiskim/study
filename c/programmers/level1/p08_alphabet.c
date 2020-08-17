#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
char* solution(const char* s) {
    char* answer = (char*)malloc(sizeof(strlen(s)+1));
	strcpy(answer, s);
	int flag = 0;
	for(int i = 0; i < strlen(s); i++)
	{
		answer[i] = tolower(answer[i]);
		if(((i - flag) % 2 == 0) && (answer[i] >= 'a' && answer[i] <='z'))
			answer[i] -= 32;
		else if(s[i] == ' ')
			flag = i + 1;
	}
	return answer;
}

int main(){
	const char *s = "AASDASD ASD";
	printf("%s", solution(s));
	return 0;
}