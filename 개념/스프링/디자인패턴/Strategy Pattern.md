## Strategy pattern
- 전략 패턴으로 불리며, 객체지향의 꽃이다.
- 우사한 행위들을 캡술화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경하여, 유연하게 확장하는 패턴 SOILD 중에서 개방폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)를 따른다.

<img width="451" alt="스크린샷 2022-09-26 오전 9 47 03" src="https://user-images.githubusercontent.com/75515697/192173887-dd15d72e-7f37-422d-813c-86e2286e3bc7.png">

- 전략 메서드를 가진 전략 객체(Normal Strategy, Base64 Strategy)
- 전략 객체를 사용하는 컨텍스트(Encoder)
- 전략 객체를 생성해 컨텍스트에 주입하는 클라이언트

<img width="452" alt="스크린샷 2022-09-26 오전 9 48 10" src="https://user-images.githubusercontent.com/75515697/192173958-e86d19c2-b03f-410b-9f82-802be482d80a.png">
