## 조건과 상관없이 한번은 수행문을 수행
- while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while은 조건과 상관없이 수행을 한 번 하고나서 조건을 체크
<img width="595" alt="스크린샷 2022-08-26 오후 3 45 48" src="https://user-images.githubusercontent.com/75515697/186839640-3631b378-c95e-499d-8629-91ebb091598f.png">

- 조건이 맞지 않으면(true가 아니면) 더 이상 수행하지 않음

## do-while 예제
- 입력받는 모든 숫자의 합을 구하는 예제
- 단, 입력이 0이 되면 반복을 그만하고 합을 출력
```Java
package ch18;

import java.util.Scanner;

public class DowhileTest {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int input;
    int sum = 0;
    
    do {
      imput = scanner.nextInt();
      sum += input;
    } while(input != 0);
    
    System.out.println(sum);
  }
}
```
