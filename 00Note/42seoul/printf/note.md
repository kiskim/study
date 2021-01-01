stdarg.h
===
+ 인자 수를 제한 없이 할 수 있도록 하는 함수를 허용할 수 있도록 한다.
+ 알려지지 않는 숫자나 타입의 함수 인자 목록을 통한 절차를 위한 기능을 제공
+ 함수
	+ void va_start(va_list ap, argN) 
		+ va_arg()를 호출하기 전에 인자를 초기화 하기 위해 사용
	+ void va_copy(va_list dest, va_list src)
		+ dest를 src 복사본으로 초기화
	+ type va_arg(va_list ap, type)
		+ ap에서 다음 인자를 얻는다
	+ void va_end(va_list ap)
		+ ap를 무효화
+ 예제 코드
	```
	void printargs(int arg1, ...)
	{
		va_list ap;
		int i;

		va_start(ap, arg1);
		for (i = arg1; i >= 0; i = va_arg(ap, int))
			printf("%d ", i);
		va_end(ap);
		putchar('\n');
	}
	```
+ 출처
	+ https://ko.wikipedia.org/wiki/Stdarg.h
	+ http://neosrtos.com/docs/posix_api/stdarg.html

<br><br>

printf
===
+ 표준 출력 함수로, 여러 종류의 데이터를 다양한 서식에 맞춰 출력하는 함수
+ 원형
	```
		int printf(const char * restrict format, ...);
	```
+ 서식 지정자
| 1 | 2 | 3 |
|---|---|---|
| 3 | 1 | 1 |
| 1 | 1 | 1 |
| 1 | 1 | 1 |