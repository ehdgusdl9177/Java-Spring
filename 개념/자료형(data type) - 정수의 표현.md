## 변수와 메모리
- 변수를 선언하면 해당되는 자료형의 크기만큼 메모리가 할당
- 변수는 할당된 메모리를 가리키는 이름
```Java
int level = 10; 
// 4바이트 정수형 메모리가 level 이라는 이름으로 할당됨
```

## 기본 자료형(Primitive data type)의 종류
<img width="576" alt="스크린샷 2022-08-16 오후 4 56 48" src="https://user-images.githubusercontent.com/75515697/184828046-c64d48af-a866-473f-89d9-a9b1771f8bb4.png">

## 정수 자료형의 종류와 크키
<img width="420" alt="스크린샷 2022-08-16 오후 4 56 59" src="https://user-images.githubusercontent.com/75515697/184828117-09ac17df-9892-4e59-a950-20c78b16ebe0.png">

## int로 10을 표현할 때
<img width="642" alt="스크린샷 2022-08-16 오후 4 57 09" src="https://user-images.githubusercontent.com/75515697/184828188-fdc3618f-ea07-4667-86ed-6d57514295b5.png">

## byte와 shot
- byte: 1바이트 단위의 자료형 동영상, 음악 파일, 실행 파일의 자료를 처리할 때 사용
- shot: 2바이트 단위의 자료형 C/C++ 언어와 호환 시 사용

## int
- 자바에서 사용하는 정수에 대한 기본 자료형
- 4바이트 단위의 자료형
- 프로그램에서 사용하는 모든 숫자(리터럴)은 int로 저장됨
- 32비트를 초과하는 숫자는 long 자료형으로 처리

## long
- 8바이트 자료형
- 숫자의 뒤에 알파벳 L 또는 I 을 써서 long 형임을 표시함
```Java
예) 
int num = 12345678900; // 오류
long lnum = 12345678900; // 오류
long lnumber = 12345678900L; // ok
```
