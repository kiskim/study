#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
char* solution(const char* phone_number) {
    char* answer = (char*)malloc(strlen(phone_number));
	strcpy(answer, phone_number);
	for(int i = 0; i < strlen(phone_number) - 4; i++)
		answer[i] = '*';
    return answer;
}