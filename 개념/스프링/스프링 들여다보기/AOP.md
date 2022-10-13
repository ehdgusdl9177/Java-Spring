## AOP(Aspect Oriented Programming)
- 관점지향 프로그램
- 스프링 어플리케이션은 대부분 특별한 경우를 제외하고는 MVC 웹 어플리케이션에서는 Web Layer, Business Layer, Data Layer로 정의
  - Web Layer: REST API를 제공하며, Client 중심의 로직 적용
  - Business Layer: 내부 정책에 따른 logic를 개발하며, 주로 해당 부분을 개발
  - Data Layer: 데이터 베이스 및 외부와의 연동을 처리
- 주요 Annotation
<img width="541" alt="스크린샷 2022-10-14 오전 8 56 57" src="https://user-images.githubusercontent.com/75515697/195732807-ba58c67b-9409-4da9-8d58-c6b38ead1fca.png">

- 횡단 관심
<img width="624" alt="스크린샷 2022-10-14 오전 8 57 26" src="https://user-images.githubusercontent.com/75515697/195732852-5aac2681-1f04-4364-a291-6b0fea6b34df.png">
