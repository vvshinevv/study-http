# :alarm_clock: 일곱번째 모임

## 스터디 진행 내용

### :movie_camera:소개

##### HTTP 를 공부해야 하는 이유 Chapter 2

#### HTTP 란 무엇인가?

HSM: 클라와 서버를 나누지 않고 구성원간 텍스트 기반으로 통신하기 위한 약속 중 하나, 규약에 대한 자유도가 높았기 때문에 표준화하게 되는 것들을
확인할 수 있었다.

KDH: 단순하게 서버와 클라이언트의 통신으로 알고 있었지만 공부하면서 헤더의 구조, 통신의 흐름에 대해서 이해를 할 수 있었다.

KDH: 서버랑 클라이언트 간의 필요한 데이터를 주고받기 위한 만들어진 통신 규약, 갖혀진 구성(메시지 형식)이 있지만 필요에 맞게 확장성을 가진 프로토콜
HTTP 개념 자체는 변한 건 없지만 어떻게 동작하는 지를 조금 더 이해함

CHH: 규약에 대한 의미가 이해하기 어려웠지만 구현해보며 실제로 어렵지 않다는 것을 알았다. 둘 간 안정성있게 데이터를 주고 받기 위한 문자열로 만들어진 규칙같다

KYS: 인터넷(WEB) 상에서 정보를 주고받기 위한 규약(약속), 단순한 목적으로 시작된 프로토콜이지만 지금은 많이 IT 의 발전으로 HTTP 또한 발을 맞춰 발전하고 있는 기술이다.

JMS: 개념적인 건 비슷하다 (클라이언트,서버 통신 규약), 달라진 점은 규악이 뭔지 알 것 같다.
규약만 정해져있으면 사용하는 건 개발자와 사용자의 몫이다.

YHJ: 통신하기 위한 규약이고 이전에는 잘 모르고 썼었던 것을 이제는 좀 더 고민해보고 사용할 수 있게 되었다.

##### HTTP 오픈소스 분석을 통해서 배울 수 있는 것들

HSM: OkHTTP 1.0 을 디버깅하다 보니까 완전 깊게 볼 수 없는 부분이 많았다. 지원이 안되는 부분도 있구나 라는 걸 배웠다
대표적으로 캐시컨트롤, 커넥션 부분을 눈으로 확인할 수 있었다.
최근에 서비스를 개발하더라도 명칭이 중요한데, 그런 부분을 생각해볼 수 있었다. 네이글 알고리즘을 볼 수 있어서 좋았다.

KDH: 많이 참여한 오픈소스 코드라는 배경으로 신뢰감있게 다가갔다. 초기 버전이라 보면서 이해가 안가는 부분들도 있어서 공감이 갔다
이런식으로 HTTP 클라이언트를 구현할 수 있구나를 코드를 보면서 배울 수 있었다. 
RFC 를 읽는 것 보다 디버깅하는 것이 이해하기 더 좋았다. 관심있던 부분을 코드로 봐서 인상깊었다.

KDH: 디버깅을 많이 하지 않는 편이어서 더 재밌었다. 업무하면서 디버깅을 잘 쓰게 되었다. 의도를 알 수 있는 코드를 짜는게 중요하다
그런것 중에 하나가 주석이다. (실무에 적용해 볼 수 있었다) 초기 버전을 공부하게 되어서 다음 버전이 궁금해졌다.

CHH: 인상 깊었던 패턴 중 하나는 Proxy 를 사용하는 부분이다. 토비의 프록시에 대한 내용을 설명할 때 한번 더 공감되었다.
디버깅에 장점은 따라가기 힘든 것들도 명확히 공부할 수 있어서 도움이 되어 다른 곳에서도 활용할 수 있을 것 같았다.

KYS: 초기버전이라 미흡한 부분이 많기도 하지만 내가 만들면 이렇게 만들 수 있을까라는 생각도 들었다. 리팩토링을 위해선 처음 구조가 중요하구나 라는 것을 느꼈다.
스프링과 비교하면서 스프링도 초기에 이랬겠구나 라는 것을 느낄 수 있었다

JMS: 비즈니스 로직을 많이 보지만 패턴등을 공부해 볼 수 있어서 좋았다. 변수/메서드 명을 헤깔릴 수 있기 때문에 잘 써야겠다고 배웠다.
HTTP 를 구현하는 입장에서도 생각해 볼 수 있어서 좋았다.

YHJ: 1.0 을 분석해볼 수 있어서 어렵지 않았고 오픈소스가 처음부터 완벽하지 않다는 것을 배웠다

### :clock1: 일정

##### 4주 정도 진행 예정 ! (예상일 뿐)

##### 오늘은 사전 준비, 다음 주는 메신저 스터디 !, 본격적으로 다 다음주부터!

### :family: Team

##### 팀을 나누자!

###### 팀1 Tg : 고유식, 다혜님, 미수님
###### 팀2 Th : 최홍희, 홍성민, 김다희

##### 룰을 정하자!

###### 이틀동안 할 수 있는 모든걸 하자 ! PR + Review + Merge

##### 개발해야지!

##### 리뷰를 해보자!

##### 고급지게 만들어보자 !

### :page_with_curl: 번역 어디할지 정하기

### :sob: 과제

> 2개의 팀으로 구성, 2주 후 재구성

#### 팀 과제

##### HTTP Client 와 Server 를 만들어보자

#### 개인 과제

##### 번역해보자
