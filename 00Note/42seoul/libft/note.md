+ 함수 포인터
	+ 기본 형태 : [반환형] [함수포인터 변수 이름] ([매개 변수 타입])
	+ 예시
	~~~
	int (*f) (int, char);
	~~~
	+ 함수를 포인터 형태로 두르는 포인터
	+ 변수를 선언할 때 정해진 반환형, 매개변수에 맞는 함수의 포인터를 입력 받을 수 있으며 함수의 매개변수로 사용 시 형태에 맞는 함수를 유동적으로 사용할 수 있다.

+ 파일 입출력
	1. write
	~~~
	ssize_t write(int fd, void *buf, size_t len);
	~~~
	+ fd : open() 시스템 콜로 열린 파일을 가리키는 파일 지정 번호
	+ buf: 파일에 쓸 데이터를 저장하고 있는 메모리 공간
	+ len: 파일에 쓸 데이터의 길이
	+ ssize_t: 성공 0/ 실패 -1
	+ 입출력 예제
	~~~
		int fd;
		char buf[20] = "hello world";

		fd = open("./writetest", O_WRONLY, S_IWUSR | S_IRUSR | S_IRGRP | S_IROTH);
		if(fd == -1)
			printf("fail\n");
		write(fd, buf, sizeof(buf));
		close(fd);
	~~~
	+ 출처: https://sonseungha.tistory.com/280

	2. oepn - fcntl.h
	+ 리눅스 기본 함수
	~~~
	int open (const char *FILENAME, int FLAGS[, mode_t MODE]);
	~~~
	+ FILENAME: 파일 이름
	+ FLAGS: 파일에 대한 열기 옵션
	+ [, mode_t MODE]: O_CREAT 옵션 사용에 의한 파일이 생성될 때 지정되는 파일 접근 권한
	+ 사용 후 close 를 통해 파일 연결 해제 필요
	+ open 옵션
	![open_opt1](https://github.com/kiskim/study/raw/master/00Note/img/open_opt1.png)
	![open_opt2](https://github.com/kiskim/study/raw/master/00Note/img/open_opt2.png)
	+ 출처: http://forum.falinux.com/zbxe/index.php?document_srl=408448&mid=C_LIB

	3. read
	+ 파일을 읽어들이는 함수
	~~~
	ssize_t read(int fd, void *buf, size_t len);
	~~~
	+ fd: open() 시스템 콜로 열린 파일을 가리키는 파일 지정 번호
	+ buf: 파일에서 읽어올 데이터를 저장 할 메모리의 포인터
	+ len: buf의 크기
	+ 반환: 정상 동작 - 읽은 바이트 수, 그렇지 않으면 0을 반환
	+ 출처: https://reakwon.tistory.com/39

+ Makefile
	+ 복잡한 컴파일 과정을 줄이고 incremental build를 사용하기 위해 사용
	+ incremaental build: 반복적인 빌드 과정에서 변경된 소스코드의 의존성이 있는 대상들만 추려 다시 빌드하는 기능

	~~~
	<target> : <dependency>
	(tap)<Recipe>
	~~~
	
	+ target: 빌드 대상 이름. 명령에 의해 생성되는 결과 파일, 오브젝트 파일이나 실행파일
	+ dependency: 대상을 만들 때 의존되는 파일들. 나열된 대상 파일들을 먼저 만들고 빌드 대상을 생성하고 의존 파일이 변경됐다면 대상을 만들도록 명령을 내리게 됨
	+ recipe: 빌드 대상을 생성하는 명령으로 여러 줄로 작성할 수 있으며, 의존 관계에 있는 파일들이 변경됐거나 대상 파일이 없을 때 명령이 실행. 쉘에서 쓸 수 있는 명령을 사용할 수 있다. tap으로 띄어준 후 작성

	+ 파일 분석
		+ SRCS: 대상 파일들
		+ NAME: 결과물
		+ OBJS: $(SRCS:.c=.o)
			+ SRCS내용의 *.c에 대응되는 *.o 리스트
		+ INCS:
		+ RM: 삭제 명령어 rm -f
		+ LIBC:
		+ CC: 컴파일러
		+ CFLAGS: 컴파일 옵션
		+ $< : 첫번째 필수 구성 요소의 이름
		+ SRCS 리스트의 *.c 파일들을 주어진 컴파일 옵션에 따라 *.o 파일로 컴파일
		~~~
		.c.o:
			$(CC) $(CFLAGS) -C &< -o $(<:.c=.o) -I$(INCS)
		
		.c.o:
			gcc -Wall -Wextra -Werror -c (SRCS 리스트 ex: ft_lstmap.c) -o (SRCS 리스트.o ex: ft_lstmap.o) -I. 
		~~~
		+ *.o로 libft.a 컴파일
		~~~
			$(NAME) : $(OBJS)
				$(LIBC) $(NAME) $(OBJS)

			libft.a : (SRCS).o
				gcc libft.a (SRCS).o
		~~~
		+ all은 목적 파일을 만든다는 고정적인 명령어로 make, make all, make libft.a 모두 libft.a라는 목적 파일을 만드는 동작을 한다.
		~~~
		all : $(NAME)

		all : libft.a
		~~~
		+ make clean 실행 시 *.o 파일들을 삭제해 정리
		~~~
		clean :
			$(RM) $(OBJS)

		clean :
			rm -f (SRCS).o
		~~~
		+ make fclean 시 clean을 실행하고 libft.a 파일 삭제
		~~~
		fclean : clean
			$(RM) $(NAME)
		
		fclean : clean
			rm -f libft.a
		~~~
		+ make re
		~~~
		re : fclean all
		~~~

	+ 참고 자료
		+ https://velog.io/@hidaehyunlee/Makefile-%EB%A7%8C%EB%93%A4%EA%B8%B0
		+ https://www.gnu.org/software/make/manual/html_node/Automatic-Variables.html
		+ https://bowbowbow.tistory.com/12
