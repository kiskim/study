#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(int n) {
    char* answer = (char*)malloc((n * 3) + 1);
    char a[3] = "수";
    char b[3] = "박";
    int j = 0;
    for (int i = 0; i < n ;i++)
    {
        if (i % 2 == 0){
            strcpy((answer + j), a);
        }
        else{
            strcpy((answer + j), b);
        }
        j+= 3;
    }
    answer[strlen(answer)] = '\0';
    return answer;
}

char* solution2(int n) {
    char* answer = (char*)malloc(n * 3);
    char *a = "수";
    char *b = "박";
    int len = strlen(a);
    for (int i = 0; i < n ;i++)
        strcpy((answer + (len * i)), i % 2 == 0 ? a : b);
    return answer;
}

int main(){
	int a;
	scanf("%d", &a);
	printf("%s", solution2(a));
	return 0;
}