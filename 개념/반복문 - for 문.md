## for 문의 수행 순서
<img width="647" alt="스크린샷 2022-08-29 오전 10 26 08" src="https://user-images.githubusercontent.com/75515697/187105245-9cbe0669-3187-40bb-ad44-fef0bc3292e9.png">

## for 문 예제 (while과 비교)
- 1부터 10까지 더한 결과를 출력
```Java
package ch19;

public class ForTest {
  
  public static void main(String[] args) {
    
    int count = 1;
    int sum = 0;
    
    for(int i = 0; i < 10; i++, count++) { // 10번
      sum += count;
      // count++
    }
    System.out.println(sum);
    
    int num = 1;
    int total = 0;
    
    while(num <= 10) {
      total += num;
      num++;
    }
    System.out.println(total);
  } 
}
```

## 각 반복문은 주로 언제 사용하는가?
<img width="643" alt="스크린샷 2022-08-29 오전 10 26 18" src="https://user-images.githubusercontent.com/75515697/187105541-ad1ad587-e719-4170-8e77-bcf718e2abc0.png">

## for 문의 문장들은 생략 가능
- 초기화식 생략: 이미 이전에 값이 초기화 되어 for 내부에서 값을 지정할 필요가 없는 경우
<img width="252" alt="스크린샷 2022-08-29 오전 10 26 31" src="https://user-images.githubusercontent.com/75515697/187105604-76e9add3-e14a-4fb7-baac-5cedc4be798d.png">

- 조건식 생략: 반복 수행에 대한 조건이 수행문 내부에 있는 경우
<img width="252" alt="스크린샷 2022-08-29 오전 10 26 40" src="https://user-images.githubusercontent.com/75515697/187105643-0be1954c-3c72-4add-b52d-ec8021ddd501.png">

- 증감식 생략: 증감식에 대한 연산이 복잡하거나 다른 변수의 연산ㄱ 결과값에 결정되는 경우
<img width="259" alt="스크린샷 2022-08-29 오전 10 26 51" src="https://user-images.githubusercontent.com/75515697/187105718-435d9286-d914-4205-8f51-6a8d8ea81197.png">

- 무한 반복
<img width="252" alt="스크린샷 2022-08-29 오전 10 26 58" src="https://user-images.githubusercontent.com/75515697/187105777-b0042116-5558-492b-b08d-17d44d61ea8c.png">

## 참고
- i+1 과 i++은 다르다.
- i+1 자체는 i 값ㅇ ㅣ증가되지 않는다. 증가하기 위해서는 대입연산자를 써야한다.
- 하지만 i++은 i = i+1 과 동일한 의미이다.
- 따라서 값을 1씩 증가하려고 한다면 i++을 사용
