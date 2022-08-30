## switch-case 문
- if-else if-else 문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
- 비교 조건이 특정 값이나 문자열인 경우 사용
- break 문을 사용하여 각 조건이 만족되면 switch 블럭을 빠져나오도록 함
- 자바 14부터 좀 더 간결해진 표현식이 지원됨(break 사용하지 않음)

## 한 달이 며칠인지 알려주는 프로그램 구현
```Java
package ch16;

public class SwitchCaseTest {
  
  public static void main(String[] args) {
    
    int month = 10;
    int day;
    
    switch(month) {
      
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        day = 31;
        break;
      case 4: case 6: case 9: case 11:
        day = 30;
        break;
      case 2:
        day = 28;
        break;
      default:
        day = 0;
        System.out.println("존재하지 않는 달 입니다.");
    }
    System.out.println(month + "월은 " + day + "일 입니다.")
  }
}
```

<img width="398" alt="스크린샷 2022-08-26 오전 11 33 39" src="https://user-images.githubusercontent.com/75515697/186804090-e395e415-7009-4ae5-afb4-8037fe32ff32.png">

- 문자열 지원되는 switch-case 문
```Java
package ch16;

public class SwitchCaseTest2 {
  
  public static void main(String[] args) {
    String medal = "Glod";
    
    switch(medal) {
      
      case "Gold":
        System.out.println("금메달 입니다.");
        break;
      case "Silver":
        System.out.pringln("은메달 입니다.");
        break;
      case "Bronze":
        System.out.println("동메달 입니다.");
        break;
      default:
        System.out.println("메달이 없습니다.");
        break;
    }
  }
}
```

<img width="395" alt="스크린샷 2022-08-26 오전 11 41 05" src="https://user-images.githubusercontent.com/75515697/186804996-0e3ab6f2-4d11-4777-9fde-37eb6e01f80e.png">

## Java 14 부터 지원되는 Switch Expression
- 간단하게 쉼표(,)로 조건 구분
- 식으로 표현하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류가 생김
- yield 키워드 사용

```Java
package ch16;

public class SwithCaseUpTest {
  
  public static void main(String[] args) {
    int month = 3;
    
    int day = switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> {
        System.out.println("한 달은 31일 입니다.");
        yield 31;
      }
      case 4, 6, 9, 11 -> {
        System.out.println("한 달은 30일 입니다.");
        yield 30;
      }
      case 2 -> {
        System.out.println("한 달은 28일 입니다.");
        yield 28;
      }
      default -> {
        System.out.println("존재하지 않는 달 입니다.");
        yield 0;
      }
    }
    System.out.println(month + "월은 " + day + "일 입니다.");
  }
}
```

<img width="396" alt="스크린샷 2022-08-26 오전 11 46 53" src="https://user-images.githubusercontent.com/75515697/186805723-5df44a5d-4c92-4328-8ed7-d4cfb1a0fc41.png">
