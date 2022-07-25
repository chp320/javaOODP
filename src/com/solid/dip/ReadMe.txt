DIP (Dependency Inversion Principle, 의존성 역전 원칙)
: 의존 관계 맺을 때 "변화하기 쉬운 것에 의존하기 보다"는 "변화하지 않는 것에 의존" 하라는 원칙

1. 정의
1) 상위 모듈은 하위 모듈에 의존해서는 안된다.
2) 추상화는 세부 사항에 의존해서는 안된다.

2. 현실 예시
- 나는 페이 서비스 개발자다 (페이: kakaoPay, NaverPay, SamsungPay, ...)
- 초기 개발 시 1개의 페이 서비스만 구현했다면... "확장에 어려운" 설계가 된다 (OCP 위배)

3. 참고
https://huisam.tistory.com/entry/DIP?category=705896
