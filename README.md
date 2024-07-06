# spring-Lv2
도서 관리 시스템

## Use Case Diagram
<img width="705" alt="345781485-09f39136-ef39-42fb-8106-2d37f59ecf1b" src="https://github.com/chltjsdl0119/spring-Lv2/assets/139723150/6169e827-edaa-442e-987b-6c4750b7295d">

## API
<img width="1004" alt="스크린샷 2024-07-06 14 42 22" src="https://github.com/chltjsdl0119/spring-Lv2/assets/139723150/8e80cf85-4009-4633-9927-e5e1a51d78a9">

## ERD
<img width="695" alt="345798972-32eef534-b751-4dde-bfe9-a9995970bff4" src="https://github.com/chltjsdl0119/spring-Lv2/assets/139723150/c1d21515-109b-4a0e-aab2-f8639f89f7df">

## 과제 질문 답변

1. 개발 하시면서 처음 설계한 API 명세서에 변경사항이 있었나요? 변경 되었다면 어떤 점 때문 일까요? 첫 설계의 중요성에 대해 작성해 주세요!
    - `선택한 도서 대출과 반납 기능에 변경사항이 있었다. 설계 과정에선 데이터를 수정할 것으로 생각하여 method를 PUT으로 작성했다.`
2. ERD를 먼저 설계한 후 Entity를 개발했을 때 어떤 점이 도움이 되셨나요?
    - `Entity 클래스를 작성할 때, 손쉽게 작성할 수 있었다.`
3. Spring MVC와 Front Controller에 대해 간략하게 설명해 주세요!
    - `Spring MVC는 자바 웹 애플리케이션을 개발하기 위한 프레임워크로, 모델-뷰-컨트롤러(MVC) 디자인 패턴을 기반으로 한다.`
    - `Front Controller 패턴은 모든 요청을 단일 컨트롤러로 처리하고, 이후 요청 처리를 각기 다른 컨트롤러로 위임하는 구조이다.`
4. IoC / DI 에 대해 간략하게 설명해 주세요!
    - `스프링 프레임워크에서 중요한 개념.`
    - `IoC는 프로그램의 제어 흐름을 직접 제어하는 대신, 외부에서 관리하도록하는 설계 원칙이다.`
    - `DI는 IoC를 구현하는 한 가지 방법으로, 객체 간의 의존성을 외부에서 주입하는 기법이다.`
5. 데이터베이스의 외래키(foreign kley)에 대해 간략하게 설명해 주세요!
    - `한 테이블의 열이 다른 테이블의 기본 키와 연결되어있음을 나타내는 제약 조건이다.`
