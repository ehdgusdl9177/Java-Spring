## 배열
- 동일한 자료형의 순차적 자료 구조
- 인덱스 연산자[]를 이용하여 빠른 참조가 가능
- 물리적 위치와 논리적 위치가 동일
- 배열의 순서는 0부터 시작
- 자바세어는 객체 배열을 구현한 ArrayList를 많이 활용함

## 배열 선언과 초기화
- 배열 선언
```Java
int[] arr1 = new int[10];
int arr2[] = new int[10];
```
<img width="602" alt="스크린샷 2022-09-02 오후 12 56 19" src="https://user-images.githubusercontent.com/75515697/188056025-1cfede4e-780e-40b6-8e0a-737f9d18e877.png">

## 배열 초기화
- 배열은 선언과 동시에 자료형에 따라 초기화 됨(정수는 0, 실수는 0.0, 객체는 null)
- 필요에 따라 초기값읖 지정할 수 있음
```Java
int[] numbers = new int[] {10, 20, 30}      // 개수 생략해야함
int[] numbers = {10, 20, 30};               // new int[] 생략 가능
int[] ids;
ids = new int[] {10, 20, 30};               // 선언 후 배열을 생성하는 경우는 new int[]를 생략할 수 없음
```

## 배열 사용
- [] 인덱스 연산자 활용 - 배열 요소가 저장된 메모리의 위치를 연산하여 찾아줌
- 배열을 이용하여 합을 구하기
```java
int[] arr = new int[10];
int total = 0;

for(int i = 0, num = 1; i < arr.length; i++, num++) {
  arr[i] = num;
}

for(int i = 0; i < arr.length; i++) {
  total += arr[i];
}
System.out.println(total);
```

## 배열의 길이와 요소의 개수는 동일하지 않다.
- 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이터)가 없는 경우도 있음
- 배열의 length 속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
- length를 활용하여 오류가 나는 경우
```Java
double[] dArr = new double[5];

dArr[0] = 1.1;
dArr[1] = 2.1;
dArr[2] = 3.1;

double mtotal = 1;
for(int i = 0; i < dArr.length; i++) {
  mtotal *= dArr[i];
}
System.out.println(mtotal);
```

- 요소의 개수에 대한 변수(count)를 따로 유지
```Java
double[] dArr = new double[5];
int count = 0;
dArr[0] = 1.1; count++;
dArr[1] = 2.1; count++;
dArr[2] = 3.1; count++;

double mtotal = 1;
for(int i = 0; i < count; i++) {
  mtotal *= dArr[i];
}

System.out.println(mtotal);
```

## 문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력
```Java
public class CharArrayTest {

	public static void main(String[] args) {

		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahbets.length; i++) {
			
			alpahbets[i] = ch++;
		}
		
		for(int i = 0; i<alpahbets.length; i++) {
			System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
		}
	}

}
```

## 향상된 for 문 사용
- 배열의 n개 요소를 0부터 n-1까지 순차적으로 순회할 때 간단하게 사용할 수 있음
```Java
for(변수 : 배열) {

}
```

```Java
public class CharArrayTest {

	public static void main(String[] args) {

		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahbets.length; i++) {
			
			alpahbets[i] = ch++;
		}
		
		for(char alpha : alpahbets) {
			System.out.println(alpha +","+ (int)alpha);
		}

	}

}
```
