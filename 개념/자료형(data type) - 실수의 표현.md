## 부동 소수점 방식
- 실수는 정수보다 정밀하기 때문에 정수와는 다른 방식으로 표현해야함
- 부동 소수점 방식으로 실수 값 0.1 표현
<img width="187" alt="스크린샷 2022-08-19 오전 8 53 10" src="https://user-images.githubusercontent.com/75515697/185514394-6584fcaf-c2fa-4a3d-80d8-c22711fd91d8.png">
- 지수부와 가수부로 표현함
- 컴퓨터에서는 밑수를 2로 사용
- 정규화: 가수가 밑수보다 작은 한 자리까지 가수로 표현되는 것
- 컴퓨터에서는 밑수가 2이므로 정규화를 하게 되면 가수부분의 첫 번째 자리 숫자는 항상 1임

## float형과 double형
<img width="546" alt="스크린샷 2022-08-19 오전 8 57 29" src="https://user-images.githubusercontent.com/75515697/185514737-2b1a45d5-7281-4b5b-bfa2-7931e7525081.png">
- 자바에서는 실수의 기본 타입은 double로 사용함

### float와 double 예제
```Java
package ch07;

public class DoubleTest {
  public static void main(String[] args) {
    double dnum = 3.14;
    float fnum = 3.14F;
    
    System.out.println(dnum);
    System.out.println(fnum);
  }
}
```

## 부동 소수점 방식의 오류
- 지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있다.
```Java
public class DoubleTest2 {
  public static void main(String[] args) {
    double dnum = 1;
    
    for(int i = 0; i < 10000; i++) {
      dnum = dnum + 0.1;
    }
    System.out.println(dnum)
  }
}
``` 

- 출력 결과
<img width="372" alt="스크린샷 2022-08-19 오전 9 02 46" src="https://user-images.githubusercontent.com/75515697/185515241-e3784ba9-8da4-484f-90bb-e99d56ca65cb.png">
