CMD로 컴파일하기
----
1.자바 컴파일러 사용

1. java 파일 생성
> * 패키지의 경우 파일 경로를 통해 사용
> * ex  
 kr.co.fastcampus -> kr\co\fastcampus
2. javac 파일 경로 및 이름
3. java 생성된 class 파일 이름

2.jar 이용
1. java 파일 생성
2. jar -cf "파일 이름.jar" "파일 경로"
>+ c: 아카이브 생성
>+ f: 생성할 파일 이름
* jar 파일은 source 파일과 설정인 manifest파일이 포함시켜 여러 파일을 관리하기 쉽도록 묶어주는 것 -> 아카이빙
3. 실행 : java -cp "패키지명을 포함한 클래스 이름"

3.jar 파일로만 실행하는 경우
1. java 파일 생성
2. jar -cmf "manifest파일이름" "파일 이름" "파일경로"
>+ m: manifest파일을 추가하는 경우 사용. manifest파일 이름을 입력해주어야 함

+ classpath를 이용하는 경우 -cp "경로"를 사용

Logback
----
+ logging을 위한 라이브러리
+ logback 의존성
>+ logback-classic
>+ logback-core
>+ slf4j-api



Maven
---------
1. pom.xml 파일을 통해 C:\Users\rlarl\\.m2\repository에 필요한 jar 파일들을 저장
2. element
>+ groupId : 패키지
>+ artifactId : 프로젝트 이름

Database - H2
-------
+ 표준 sql 따름
+ H2: 자바로 작성된 관계형 데이터베이스
+ 윈도우에서는 jar파일 직접 실행 가능
+ 파일과 메모리 모드 지원
>+ 파일 유지가 팔요한 경우 -> 파일 모드 - jdbc:h2:~/파일이름
>+ 가벼운 테스트 용 -> 메모리 모드(휘발성) - jdbc:h2:mem:db명
+ 호환 모드 지원
