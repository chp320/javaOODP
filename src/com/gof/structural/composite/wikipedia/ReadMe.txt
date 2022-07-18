1. UML
https://t1.daumcdn.net/cfile/tistory/99E9FF455C84AF1E20
- Client: Leaf와 Composite 클래스를 직접 참조하지 않고, 공통 인터페이스인 "Component" 를 참조한다.
- Leaf: "Component" 인터페이스를 구현한다.
- Composite: "Component" 인터페이스를 구현하고, 구현되는 자식 (Leaf or Composite) 들을 가진다. 이들 자식들을 관리하기 위한 메서드 (addChild, removeChild, ...)를 구현한다.

2. 목적 (intent)
- 복합 객체(a group of object) 나 단일 객체를 동일하게 취급하는 것을 목적으로 함
- 트리 구조로 작성 -> 전체-부분(whole-part) 관계를 표현