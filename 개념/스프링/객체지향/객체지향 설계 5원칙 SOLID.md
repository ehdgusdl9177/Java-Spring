## 객체지향 설계 5원칙 SOLID
### 응집도와 결합도
- 좋은 소프트웨어 설계를 위해서는 결합도(coupling)는 낮추고 응집도(cohesion)는 높여야한다.


- 결합도
  - 모듈(클래스)간의 상호 의존 정도를 나타내는 지표로써 결합도가 낮으면 모듈간의 상호 의존성이 줄어들어서 객체의 재사용 및 유지보수가 유리하다.

- 응집도
  - 하나의 모듈 내부에 존재하는 구성 요소들의 기능적 관련성으로 응집도가 높은 모듈은 하나의 책임에 집중하고 독립성이 높아져, 재사용 및 유지보수가 용이하다.

### SRP(Single Responsibility Principle) 단일 책임 원칙
- 어떠한 클래스를 변경해야 하는 이유는 한가지 뿐 이여야 한다.

<img width="664" alt="스크린샷 2022-09-23 오전 9 02 45" src="https://user-images.githubusercontent.com/75515697/191871293-6534ab9d-5411-41bb-86ab-a6cb917b4227.png">

<img width="662" alt="스크린샷 2022-09-23 오전 9 02 56" src="https://user-images.githubusercontent.com/75515697/191871301-50ce6db0-3c9c-4c53-94f4-b1149eeb88c1.png">

<img width="585" alt="스크린샷 2022-09-23 오전 9 03 05" src="https://user-images.githubusercontent.com/75515697/191871311-7f9b1022-c520-416a-8cb8-5aa0396a0619.png">

```Java
class Unit {
  private String name;
  private int speed;
  
  public void attack() {
  }
  
  public void move() {
    if(name.equals("저글링")) {
      speed += 3;
    } else if(name.equals("탱크")) {
      if("탱크모드") {
        speed = 0;
      } else {
        speed = 10;
      }
    } else if(name.equals("정찰기")) {
      speed = 15;
      충돌 = false;
    }
  }
}
```

```Java
class 저글링 extends Unit {
  public void move() {
    this.speed += 3;
  }
}

class 탱크 extends Unit {
  public void move() {
    if("탱크모드") {
      speed = 0;
    } else {
      speed = 10;
    }
  } 
}

class 정찰기 extends Unit {
  public void 정찰기() {
    this.출돌 = false;
  }
  public void move() {
    speed = 15;
  }
}
```

### OCP(Open Closed Principle) 개방 폐쇄 원칙
- 자신의 확장에는 열려 있고, 주변의 변화에 대해서는 닫혀 있어야 한다.
- 상위 클래스 또는 인터페이스를 중간에 둠으로써, 자신은 변화에 대해서는 폐쇄적이지만, 인터페이스는 외부의 변화에 대해서 확장을 개방해 줄 수 있다.
- 이러한 부분은 JDBC와 Mybatis, Hibernate 등 JAVA에서는 Stream(Input, Out)에서 찾아볼 수 있다.
<img width="559" alt="스크린샷 2022-09-23 오전 11 22 12" src="https://user-images.githubusercontent.com/75515697/191881335-369a3590-016c-496e-8959-e360368bdebd.png">

### LSP(Liskov Substitution Principle) 리스코프 치환 원칙
- 서브 타입은 언제나 자신의 기반(상위) 타입으로 교체할 수 있어야 한다.
<img width="701" alt="스크린샷 2022-09-23 오전 11 23 33" src="https://user-images.githubusercontent.com/75515697/191881435-82d3cb2e-dea0-4e25-a70b-f2b62348d437.png">

### ISP(Interface Segregation Principle) 인터페이스 분리 원칙
- 클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안된다.
- 프로젝트 요구 사항과 설계에 따라서 SRP(단일책임원칙) / ISP(인터페이스분리원칙)를 선택한다.
<img width="691" alt="스크린샷 2022-09-23 오전 11 25 04" src="https://user-images.githubusercontent.com/75515697/191881534-34263be5-5aa7-4c16-8a4d-97e611da9365.png">

### DIP(Dependency Inversion Principle) 의존 역전 원칙
- 자신보다 변하기 쉬운 것에 의존하지 말아야 한다.
<img width="653" alt="스크린샷 2022-09-23 오전 11 25 53" src="https://user-images.githubusercontent.com/75515697/191881611-c73edf3f-47bb-4345-b1a2-094bb2ee7cc3.png">

- 개발 폐쇄 원칙에서도 살펴본 부분이다.
- SOLID는 객체 지향 4대 특성에 기반함으로써 유사한 모양을 가지고 있다.
<img width="657" alt="스크린샷 2022-09-23 오전 11 26 42" src="https://user-images.githubusercontent.com/75515697/191881683-968a1927-7c0b-4d56-b52e-fc7663407ac1.png">
