#include <stdio.h>

int main(){
	char s[1000000];
	int count = 0, i = 0;
	int flag = 0;

	gets(s);
	while(s[i] && i < 999999)
	{
		if(s[i] == ' ' && flag > 0)
		{
			flag = 0;
			count++;
		}
		if((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z'))
			flag++;
		i++;
	}
	if(flag > 0)
		count++;
	printf("%d", count);
	return 0;
}

/*
	// 참고 용 코드
	// 위 방법보다 4ms 정도 빠름

    int i=0,cnt=0;
    gets(arr);
	// 공백(' ')만 들어있거나 길이가 1인경우 0으로 패스
    if(arr[0]==' '&&strlen(arr)==1)
    {
        printf("0");
    }
    else{
		// 가장 앞에 공백 유무 상관없이 패스하기 위해 1부터 시작
		// 가장 마지막 공백을 무시하기 위해 길이 - 1
        for(i=1; i<strlen(arr)-1; i++)
    	{
        	if(arr[i] == ' ')
         	   cnt++;
    	}
		// 공백 수 + 1해야 단어 수
    	printf("%d",cnt+1);
    }
*/