1. 정의
- 상태 자체를 '객체화'하고, 상태에 따른 액션(행동)도 상태 객체 내부에 구현하는 패턴
참조) https://dailyheumsi.tistory.com/212?category=855210

1-1. 부연 설명
- 보통 객체를 추상화할 때 행동의 주체는 '클래스', 대상이 하는 행동을 '메서드'로 정의하고 해당 대상의 상태는 '속성'으로 정의한다.
- 일반적으로 현재 주체의 상태에 따라 행동이 달라지는 경우 조건문을 통해 처리한다 -> 상태 종류가 많아질 수록 조건문도 많아지고 가독성이 떨어짐

1-2. 장점
- 상태 종류에 종속하는 조건문 제거를 통해 코드 가독성 증가
- 상태-행동을 묶어서 처리함으로써 클래스 자체를 상태-행동과 분리
1-3. 단점
- 상태 종류에 따라 클래스가 늘어난다.
- 상태-행동 간 결합이 강해진다.

2. 구조
UML) https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FD6kJW%2FbtqCTwgznmI%2FdGFOfCyj7bCpmVmqLwqeMK%2Fimg.png
- State
  상태를 나타내는 추상 클래스
  각 상태에 따른 액션(메서드) 인터페이스를 정의
- ConcreteState
  State 를 상속하여 구체적인 상태를 나타내는 클래스

3. 예제 코드
- 온라인 쇼핑몰에서 물건 구입 시 상태가 지속 변경됨
- 다음 일련의 상태를 관리 : 주문(ORDER) > 결제(PAY) > 주문 완료(ORDERED) > 배송 완료(FINISHED)
