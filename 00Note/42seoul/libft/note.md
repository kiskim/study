memset
---
+ 메모리의 시작점부터 연속된 범위를 어떤 값(바이트 단위)으로 저장
+ 프로토타입 :
	~~~
	void * memset(void * ptr, int value, size_t size);
	~~~
	+ ptr: 채우고자 하는 메모리의 시작 주소 포인터
	+ value: 메모리에 채우고자 하는 값, int 형이지만 내부에서는 unsigned char(1byte)로 변환되어 저장
	+ size: 채우고자 하는 바이트 수( = 채우고자 하는 메모리 크기)
+ void 포인터
	+ void 포인터는 형식이 지정되어 있지 않은 포인터를 말한다
	+ void 포인터는 타입 캐스팅이 이루어지지 않으면 값을 읽거나 쓰기가 불가능하다
	+ 매개변수로 void 포인터를 사용하면 함수를 타입별로 선언하지 않고 한번에 처리가 가능하다.
+ 전체 코드
	~~~
	void	*ft_memset(void *ptr, int value, size_t num)
	{
		int		i;
		int		size;
		void	*temp;

		size = num;
		temp = ptr;
		i = 0;
		while (i < size)
		{
			*((unsigned char*)temp + i) = value;
			i++;
		}
		return (ptr);
	}
	~~~
+ 함수 내부에서 unsigned char를 사용하는 이유
	+ 전체 비트 모두를 value값으로 볼 수 있다
	+ signed char는 음수 비트를 포함하고있기 때문에 예기치 못한 결과를 발생할 수 있다.
+ 해결하는데 어려웠던 점
	+ void 포인터에 대한 이해
	+ memset 함수에 대한 이해가 부족해 바이트 단위로 처리한다는 것을 몰라 내부 처리를 unsinged char를 사용해 처리하는 이유에 대해 이해하는 시간이 오래걸렸다.
+ 참고 자료
	+ memset: https://twpower.github.io/79-usage-of-memset-function
	+ memset: https://www.tutorialspoint.com/c_standard_library/c_function_memset.htm
	+ void pointer: http://soen.kr/lecture/ccpp/cpp1/10-2-2.htm
	+ 자료형: https://kldp.org/node/75686

strchr
---
+ 문자열 내에 일치하는 문자가 있는지 검사하는 함수
+ 프로토타입:
	```
	char * strchr(const char *str, int c);
	```
	+ str: 검색할 문자열
	+ c: 존재하는지 확인할 문자(아스키값으로 들어감)
	+ return: 함수가 존재하는 포인터
+ 전체 코드
	~~~
	char	*ft_strchr(const char *str, int c)
	{
		while (*str != (char)c)
		{
			if (!*str++)
				return (0);
		}
		return ((char*)str);
	}
	~~~
+ 참고 자료
	+ strchr: https://blockdmask.tistory.com/389

bzero
---
+ 바이트 스트링 ptr의 시작부터 size 바이트만큼 0으로 채운다
+ 초기화 목적으로 사용되며 현재는 잘 사용되지 않고 memset으로 대체한다
+ 프로토타입:
	```
	void bzero(void *ptr, size_t size);
	```
	+ ptr: 메모리의 시작 주소 포인터
	+ size: 채우고자하는 바이트 수
+ 참고 자료
	+ https://www.joinc.co.kr/w/man/3/bzero

memcpy
---
+ 메모리의 일부분을 복사하는 함수
+ 프로토타입:
	~~~
	void *memcpy(void *destination, const void *source, size_t num);
	~~~
	+ source가 가르키는 곳 부터 num 바이트 만큼을 destination이 가리키는 곳에 복사한다.
	+ source와 destination의 타입을 고려하지 않고 단순 이진 데이터를 복사한다.
	+ source의 null 종료 문자를 검사하지 않고 무조건 num 바이트 만큼 복사한다.
+ 전체 코드
	~~~
	void	*ft_memcpy(void *destination, const void *source, size_t num)
	{
		unsigned char	*dest;
		unsigned char	*sour;
		int				size;

		dest = (unsigned char*)destination;
		sour = (unsigned char*)source;
		size = num;
		while (size--)
		{
			*(dest + size) = *(sour + size);
		}
		return (destination);
	}
	~~~