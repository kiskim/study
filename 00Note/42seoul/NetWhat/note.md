+ https://stitchcoding.tistory.com/4

+ What is an IP address : IP 주소란 무엇인가?
+ What is a Netmask: 넷마스크란 무엇인가?
+ What is the subnet of an IP with Netmask: 넷마스크가 포함된 IP의 서브넷은?
+ What is the broadcast address of a subnet: 서브넷의 브로드캐스트 주소는?
+ What are the different ways to represent an ip address with the Netmask: 넷마스크가 있는 ip 주소의 표현 방법은 어떤 것들이 있는가?
+ What are the differences between public and private IPs: 사설, 공인 IP의 차이점은?
+ What is a class of IP addresses: IP주소의 클래스란?
+ What is TCP: TCP란?
+ What is UDP: UDP란?
+ What are the network layers: 네트워크 레이어란?
+ What is the OSI model: OSI모델이란?
+ What is a DHCP server and the DHCP protocol: DHCP 서버, 프로토콜이란?
+ What is a DNS server and the DNS protocol: DNS 서버, 프로토콜이란?
+ What are the rules to make 2 devices communicate using IP addresses: 2개의 기기가 IP주소를 이용해 소통하기 위한 규칙엔 어떤 것들이 있는가?
How does routing work with IP: IP 라우팅 동작 원리는?
+ What is a default gateway for routing: 라우팅 시 디폴트 게이트웨이란?
+ What is a port from an IP point of view and what is it used for when connecting to another device: IP에서 포트란 무엇이며, 기기끼리 연결할 때 어떤 식으로 사용되는가?

IP - Internet Protocol
---
+ 인터넷에서 데이터(패킷)을 주고 받는 것에 관련된 규약으로 패킷 작성 방법, 주소 탐색 방법 등 규칙을 정해 놓은 것들이라 볼 수 있다.
+ 함께 나오는 TCP(Transmission Control Protocol)은 데이터의 효율적인 전달(쪼개고 합치기)과 관련된 규칙을 담당한다면, IP는 이런 데이터를 어떻게 어디로 전달할지와 관련된 규칙을 담당한다.

IP 주소
---
+ 프로토콜 안에서 데이터가 전송되어야 할 주소를 지칭
+ IP 표기법 - IPv4
	+ 8비트 4개 조합 = 32비트
	+ 온점으로 구분된 숫자들을 '옥텟'이라하며 2진수와 10진수로 표현한다.
	+ ex) 
	~~~
	11111111.11111111.11111111.11111111 - 255.255.255.225
	11000000.10101000.00000000.00000001 - 192.168.0.1
	~~~
+ IPv4는 조합이 42억개 정도로 이미 포화 상태이기 때문에 이를 해결하기 위해 IPv6로 옮겨가고 있으며 아직까지는 IPv4에 많이 의존하고 있다.

클래스
---
+ 일종의 IP 주소 타입
+ 원래 있던 용도 구분은 무의미해지고 지금은 규모에 따른 구분으로 사용
+ 클래스 종류
	+ A: 첫 옥텟 1 ~ 126, 사설 IP 10.0.0.0. ~ 10.255.255.255., 네트워크 ID - 1 옥텟 
	+ B: 첫 옥텟 128 ~ 191, 사설 IP 172.16.0.0 ~ 172.31.255.255., 네트워크 ID - 1 ~ 2 옥텟
	+ C: 첫 옥텟 192 ~ 223, 사설 IP 192.168.0.0. ~ 192.168.255.255, 네트워크 ID - 1 ~ 3 옥텟
+ D, E 클래스: 멀티캐스팅이나 정부 차원에서 사용하는 특수 클래스
+ 흔히 사용하는 localhost라 지칭하는 127.0.0.1.에서 127은 A클래스에 속하지만 보통은 자기자신을 나타내며 이를 localloopback이라 지칭한다.

사설 & 공인 IP
---
+ 공인 IP: 어떤 네트워크가 갖는 고유한 주소
+ 사설 IP: 하나의 네트워크 안에 주어지는 상대적 주소
+ 사설 IP는 공인 IP 내에 연결되어있는 장치들의 주소를 말하며, 다른 공인 IP에있는 사설 IP는 같은 값을 가질 수 있다.

포트 & NAT
---
+ LAN (Local-Area Network): 여러 기기가 하나의 네트워크(라우터)에 연결되어 있는 것
+ WAN (Wide-Area Network): 라우터를 통해 외부의 네트워크들이 모여있는 것으로 인터넷 또한 거대한 WAN
+ NAT (Network Address Translation): 사설 IP를 공인 IP와 매핑해주는 것
+ Port: 컴퓨터 등 장치마다 인터넷에서 데이터가 오갈 수 있는 통로
+ Port Forwarding: 외부에서 LAN 안에 있는 기기나 서비스에 접근할 때 사용되는 기술
+ 디폴트 게이트웨이
	+ 다른 네트워크로 통하는 엑세스 포인트
	+ 라우터가 있다면 라우터의 사설 IP의 주소가 된다.
	+ 기본적으로 사용 가능한 호스트 중 가장 첫 번째

서브넷 & 서브넷 마스크
---
+ 서브넷: 하나의 네트워크를 쪼개 만든 네트워크로 다음과 같은 장점을 가진다
	+ 보안, 관리, 속도, 성능
+ 서브넷 마스크: 몇 번째 옥탯까지가 네트워크 아이디인지 알려주는 척도
+ ex ) 클래스 C
	~~~
	192.168.0.1. 주소
	255.255.255.0 서브넷 마스크
	~~~
	+ 클래스 C이기 때문에 192.168.0까지 네트워크 ID, 뒤 1이 호스트 ID가 이되기 때문에 서브넷 마스크는 255.255.255.0.이 된다.
	+ 즉, IP 주소에서 서브넷 마스크를 2진수로 풀었을 때 1인 자릿수까지 네트워크 ID 영역이 된다.
	~~~
	11000000.10101000.00000000.00000001 (192.168.0.1)
	11111111.11111111.11111111.00000000 (255.255.255.0)
	~~~

CIDR - Classless Inter-Domain
---
+ 클래스로만 구분했을 시 낭비되는 호스트가 많아 이를 개선하기 위해 도입
+ 네트워크 ID로 사용되는 범위를 자유롭게 표기해 네트워크를 세부적으로 쪼갤 수 있게됨
+ ex)
	~~~
	192.168.0.1 주소
	255.255.255.0 서브넷 마스크
	~~~
	+ CIDR 표기
	~~~
	192.168.0.1/24
	~~~
+ 슬래시 뒤 수는 몇 개까지의 비트가 네트워크 ID로 유효한지를 의미
+ ex)
	~~~
	158.167.18.156/15
	10011110.1010011 1.00010010.10011100 (158.167.18.156)
	11111111.1111111 0.00000000.00000000 (15)
	범위 158.166.0.1 ~ 158.167.255.254
	~~~
+ 호스트 영역이 모두 0 -  네트워크 자체 주소, 호스트 영역 모두 1 - 브로드캐스트 주소이므로 사용되지 않음

OSI 모델
---
+ 네트워크 관련 프로토콜과 관련 기술과 규약을 계층으로 분리해 정리한 것
+ OSI 7계층
	1. 물리 계층(Physical layer)
		+ 하드웨어 전송 기술 관련
	2. 데이터 링크 계층 (Data link layer)
		+ 네트워크 위의 개체들 간 데이터 전달
		+ 물리 계층에서 발생한 오류 검출
		+ 오류 수정에 필요한 기능적, 절차적 수단 제공
	3. 네트워크 계층(Network layer)
		+ 여러 노드를 거칠 때 경로를 찾아주는 역할
		+ 전송 계층이 요구하는 서브스 품질(QoS)을 제공하기 위한 기능적, 절차적 수단 제공
		+ 패킷 전송 관련된 계층으로 라우팅, IP 가 속함
	4. 전송 계층(Transport layer)
		+ 사용자 간의 데이터 흐름과 관련
		+ TCP, UDP
	5. 세션 계층(Session layer)
		+ 양 끝단 응용 프로세스가 통신을 관리하기 위한 방법 제공
		+ TCP/IP 세션을 만들고 없에는 책임을 가짐
	6. 표현 계층(Presentation layer)
		+ 코드 간의 번역 담당
		+ 인코딩, 압축, 암호화
	7. 응용 계층(Application layer)
		+ 서비스를 구현하기 위한 프로토콜 모음
		+ 응용 프로세스와 직접 관계해 응용 서비스 수행
		+ DNS, DHCP, HTTP, HTTPS, FTP, SSH, Telnet
DNS & DHCP
---
+ 둘 모두 IP 주소를 이름과 연결해 주는 것과 관련된다.
+ DNS - Domain Name Server, 주소 명을 IP 주소로 전환
+ DHCP - Dynamic Host Configuration Protocol
	+ IP 주소를 어떤 웹 사이트의 이름에 할당해줄지를 결정하는 프로토콜
	+ 실제 IP 주소는 고정적이지 않고 동적으로 할당
	+ 사용중이지 않거나 대여 기간이 끝난 IP 주소를 할당하는 방식
	+ DNS가 IP 주소와 매치시키기 전에 할당을 해주는 과정과 관계