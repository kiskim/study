#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(long long n) {
    long long i = 1;
    while(i * i < n)
        i++;
    return i * i == n ? (i+1) * (i+1) : -1;
}

int main(){
	printf("%d", solution(11));
	return 0;
}