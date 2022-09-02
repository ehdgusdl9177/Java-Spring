## 싱글톤 패턴
- 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
- static 변수, 메서드를 활용하여 구현할 수 있음

## 싱글톤 패턴으로 회사 객체 구현
- 생성자는 private으로 선언
```Java
private Company() {}
```

- 클래스 내부에 유일한 private 인스턴스 생성
```Java
private static Company instance = new Company();
```

- 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
```Java
public static Company getInstance() {
  if(instance == null) {
    instance = new Company();
  }
  return instance;
}
```

- CompanyTest.java
```Java
public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		//Calendar calendar = Calendar.getInstance();
	}
}
```

<img width="259" alt="스크린샷 2022-09-02 오전 11 28 18" src="https://user-images.githubusercontent.com/75515697/188045716-31d4593c-d7c2-46e3-a3cd-067de4eaae09.png">
