#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int num) {
    char* answer = (char*)malloc(num % 2 == 0 ? 5 : 4);
    strcpy(answer, num % 2 == 0 ?"Even" : "Odd");
    return answer;
}