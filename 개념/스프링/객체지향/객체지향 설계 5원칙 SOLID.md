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
```

