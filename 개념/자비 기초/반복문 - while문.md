## 조건이 참(true)인 동안 반복수행
- 주어진 조건에 맞는 동안(true) 지정된 수행문을 반복적으로 수행하는 제어문
- 조건이 맞지 않으면 반복하던 수행을 멈추게 됨
- 조건은 주로 반복 횟수나 값의 비교의 결과에 따라 true, false 로 판단됨
- 예) 달리는 자동차, 일정 횟수만큼 돌아가는 나사못, 특정 온도까지 가동되는 에어컨 등

## while문
- 수행문을 수행하기 전 조건을 체크하고 그 조건의 결과가 true인 동안 반복 수행

<img width="709" alt="스크린샷 2022-08-26 오후 1 24 55" src="https://user-images.githubusercontent.com/75515697/186822176-51ba1487-6b1f-49e2-84db-1293dac6855f.png">

## while문 예제
- 1부터 10까지 더하여 그 결과 출력
```Java
package ch17;

public class WhileTest {
  
  public static void main(String[] args) {
    
    int num = 1;
    int sum = 0;
    
    while(num <= 10) {
      
      sum += num;
      num++;
    }
    System.out.println(sum);
    System.out.println(num);
  }
}
```

## 무한 반복할 때
```Java
while(true) {
  ......
}
```
