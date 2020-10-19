+ memset
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

+ strchr
	+ 문자열 내에 일치하는 문자가 있는지 검사하는 함수
	+ 프로토타입:
		```
		char * strchr(const char *str, int c);
		```
		+ str: 검색할 문자열
		+ c: 존재하는지 확인할 문자(아스키값으로 들어감)
		+ return
			+ 함수가 존재하는 포인터
			+ 존재하지 않으면 null
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

+ bzero
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

+ memcpy
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
		
+ memccpy
	+ 프로토타입
		~~~
			void *memccpy(void *dest, const void *src, int c, size_t n);
		~~~
		+ dest: 복제가 되는 되는 변수
		+ src: 복제할 원본 데이터
		+ c: src에서 만나면 복제를 중단할 값
		+ n: 복제할 데이터의 byte 수
		+ return
			+ dest+: 추가 복제 편의를 위해 끝난 데이터의 다음 메모리 번지
			+ null: src에서 c문자를 만나지 못함
	+ src의 데이터를 n 바이트 dest에 복제할 때 src에서 문자 c를 만나면 c까지 복제하고 중단
	+ 복제가 완료된 dest의 다음 번지를 리턴
	+ c를 만나지 않는다면 n 바이트를 복제하고 null을 리턴
	+ 참고 자료
		: https://www.it-note.kr/66

+ memmove
	+  프로토타입
		~~~
			void *memmove(void *dest, const void* src, size_t num);
		~~~

		+ dest: 데이타가 복사 될 곳
		+ src: 복사 할 데이터
		+ num: 복사 할 바이트 수
		+ return: dest
	+ 메모리 블록을 옮기는 함수
	+ src부터 num 바이트 만큼 dest로 옮긴다
	+ 메모리 복사 수행시 중간에 버퍼를 사용해 dest, src의 해당 범위가 겹쳐도 상관 없다
	+ src의 null문자를 확인하지 않고 무조건 num 바이트 만큼 복사 수행
	+ 오버 플로우 방지를 위해 dest, src가 가리키는 배열 모두 적어도 num 바이트 이상 되어야한다
	+ memcpy와 차이점
		+ memmove는 데이터를 복사 할 때 버퍼를 사용해 임시 공간을 할당, 복사하기 때문에 겹치는 dest와 src가 겹치는 경우 오버랩 현상을 방지할 수 있다.
		+ 속도면에서는 memcpy가 낫지만, 안정성에서는 memmove가 더 좋다.
	+ 참고 자료
		+ https://modoocode.com/78
		+ https://blog.naver.com/sharonichoya/220510332768

+ memchr
	+ 프로토타입
		~~~
			void *memchr(const void* ptr, int value, size_t num);
		~~~

		+ ptr: 탐색할 메모리의 시작 포인터
		+ num: ptr에서부터 num 바이트를 탐색
		+ value: 일치하는지 확인 할 값
		+ return: 일치하는 곳이 있으면 일치하는 곳의 주소값, 없으면 null을 리턴
	+ ptr이 가리키는 메모리 처음 num 바이트 중 처음으로 value와 일치하는 값의 주소값을 리턴
	+ 참고 자료: https://modoocode.com/92

+ memcmp
	+ 프로토타입
		~~~
			int memcmp(const void *ptr1, const void *ptr2, size_t num);
		~~~

		+ ptr1, ptr2: 비교할 메모리의 주소 값
		+ num: 비교할 바이트 수
		+ return
			+ ptr1 == ptr2: 0
			+ ptr1 > ptr2: 양수
			+ ptr1 < ptr2: dmatm
	+ 두 메모리 블록의 값을 앞에서부터 비교하는 함수
	+ 참고 자료: https://modoocode.com/84

+ strlen
	+ 프로토타입
		~~~
			size_t strlen(const char *str);
		~~~

		+ str: 길이를 확인할 문자열
		+ return: 문자열의 길이를 리턴
	+ 문자열의 길이를 확인하는 함수
	+ C언어의 문자열은 끝 문자가 "\0"이 포함되어 문자열의 끝을 확인 할 수 있따
	+ 문자열의 길이는 끝 문자(=널 문자 = \0)을 제외한 시작부터 끝 까지의 길이를 말한다.

+ strlcpy
	+ 프로토타입
		~~~
			size_t strlcpy(char *destination, const char *source, size_t size);
		~~~

		+ destination: 데이터를 저장할 메모리의 시작 주소
		+ source: 복사 할 메모리의 시작 주소
		+ size: 널 문자를 포함한 복사 할 길이
		+ return: destination의 길이
	+ 문자열을 복사하는 strcpy의 보안 목적으로 대체하기 위한 함수
	+ 문자열을 복사할 때 마지막에 널 문자 삽입이 보장되는 함수
	+ source의 값을 destination에 복사하는데 size 길이만큼을 복사하는데 마지막에 널 문자(\0)를 포함한 길이를 복사한다
	+ 때문에 "1234"를 size=3이면 복사한다면 "12"만 복사되고, size = 1인 경우 널문자만 입력된다.
	+ 참고 자료: https://whatdocumentary.tistory.com/44

+ strlcat
	+ 프로토타입
		~~~
			size_t strlcat(char *destination, const char *source, size_t num);
		~~~
		+ destination: 메모리가 복사 될 곳의 주소
		+ source: 복사 할 메모리의 주소
		+ num: destination의 길이 + source의 길이 + 1(\0 길이)
		+ return: 널 문자를 제외한 결합된 문자열의 총 길이를 반환
	+ strncat의 안정성을 보완한 함수
	+ destination뒤에 source를 추가해주는 함수
	+ ex) destination = 5, src = 4
		+ size < destination + 1: 복사 X
		+ size = 8: destination + source 2 + \0 
	+ size - strlen(destination) - 1 만큼 source에서 복사된다.
	+ 참고 자료
		+ https://whatdocumentary.tistory.com/45
		+ https://hanul-dev.netlify.app/c/strlcat()-%EA%B5%AC%ED%98%84/

+ strrchr
	+ 프로토타입
		~~~
			char *strrchr(const char *s, int c);
		~~~

		+ s: 탐색 대상이 될 문자열
		+ c: 탐색 할 문자
		+ return: 찾은 문자의 위치 or NULL
	+ 문자열에서 문자를 검색하되 가장 마지막의 위치를 찾는다
	+ 참고 자료: https://modoocode.com/96

+ strnstr
	+ 프로토타입
		~~~
			char *strnstr(const char *big, const char *little, size_t len);
		~~~

		+ big: 탐색 대상이 될 문자열의 포인터
		+ little: 탐색할 문자열
		+ len: bit 시작 포인터에서 탐색할 길이
		+ return
			+ little이 비어있는 경우 big을 반환
			+ little이 big에 없는 경우 null 반환
			+ little이 존재하는 경우 big에서 little이 시작하는 포인터 반환
	+ big 포인터에서 len까지의 범위에서 little과 일치하는 데이터의 포인터를 찾는 함수
	+ 참고 자료
		+ https://whatdocumentary.tistory.com/49
		+ https://nxmnpg.lemoda.net/3/strnstr

+ strncmp
	+ 프로토타입
		~~~
			int strncmp(const char *s1, const char *s2, size_t n);
		~~~

		+ s1, s2: 비교할 문자열
		+ n: 비교할 문자열 길이
		+ return: 같으면 0, s1의 크면 1, s2가 -1
	+ 문자열 s1, s2를 비교하는 함수

+ atoi
	+ 프로토타입
		~~~
		int atoi(const char *nptr);
		~~~
	+ 입력된 문자열을 숫자로 바꾸어주는 함수
	+ 입력된 문자열에서 숫자가 아닌 문자가 올 때 까지 정수로 변환해서 반환
	+ 첫 "-" 기호를 통해 부호를 결정하고 이후에는 문자로 취급한다.
	+ 참고 자료: https://blockdmask.tistory.com/331

+ isalpha
	+ 프로토타입
		~~~
			int isalpha(int c);
		~~~
	+ 입력된 문자가 알파뱃인지 확인하는 함수
	+ 대소문자 관계 없이 알파뱃이면true
	+ 자료 출처: https://linux.die.net/man/3/isalpha

+ isdigit
	+ 프로토타입
		~~~
			int isdigit(int c);
		~~~
	+ 숫자를 판단하는 함수	
	+ 자료 출처: https://linux.die.net/man/3/isalpha

+ isalnum
	+ 알파뱃이거나 숫자인지 확인
	+ int isalnum(int c);
+ isascii
	+ 7bit unsinged char 값으로 ascii 문자가 맞는지 확인
	+ int isascii(int c);
+ isprint
	+ 출력 가능한 문자열인지 확인
	+ int isprint(int c);
+ toupper, tolower
	+ 각각 대문자, 소문자로 변환하는 함수
	+ 변환이 불가능한 경우 입력을 그대로 출력
	+ int toupper(int c);
	+ int tolower(int c);

+ calloc
	+ void *calloc(size_t n, size_t size);
	+ n: 할당 할 메모리의 단위 갯수
	+ size: 하나당 크기
	+ 할당된 메모리 공간을 모두 0으로 초기화한다
	+ https://m.blog.naver.com/PostView.nhn?blogId=sharonichoya&logNo=220501158281&proxyReferer=https:%2F%2Fwww.google.com%2F


+ strdup
	+ char *strdup(constr char *s);
	+ 문자열 s를 복사하고 복사된 문자열을 가리키는 포인터를 반환하는 함수
	+ 공간을 확보하기 위해 내부적으로 malloc을 호출
	+ 사용 후 free를 사용해 메모리 해제가 필요
	+ 할당이 정상적으로 성공했을 경우 포인터를 반환하고 에러시 NULL을 반환한다.
	+ https://m.blog.naver.com/PostView.nhn?blogId=wideeyed&logNo=80012714484&proxyReferer=https:%2F%2Fwww.google.com%2F

+ 자료 출처: https://linux.die.net/man/

+ 추가 함수
+ ft_substr
	+ char *ft_substr(char const *s, unsigned int start, size_t len);
	+ s: 자를 문자열의 포인터
	+ start: 자르기 시작할 인덱스
	+ len: 자를 최고 길이
	+ return: 성공 시 포인터, 실패 시 NULL
	+ malloc을 사용해 메모리를 할당하고 s를 strart 인덱스부터 최대 len 길이만큼 자른 문자열의 포인터를 반환

+ ft_strjoin
	+ char *ft_strjoin(char const *s1, char const *s2);
	+ s1: prefix string
	+ s2: suffix string
	+ return: new string, NUll
	+ s1과 s2를 연결한 문자열의 포인터를 반환

+ ft_strtrim
	+ char *ft_strtrim(char const *s1, char const *set);
	+ s1: 삭제 처리할 대상 문자열
	+ set: 삭제할 문제 집합
	+ return: 새로 할당되어 삭제 처리된 문자열

+ ft_split
	+ char **ft_split(char const *s, char c);
	+ s: 분할 할 문자열
	+ c: 분할 기준
	+ return: 분할된 문자열의 포인터 배열 / null
	