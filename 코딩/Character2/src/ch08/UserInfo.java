package ch08;

public class UserInfo {
	
	public String name;
	public String gender;
	public int age;
	public int height;
	public int weight;
	
	public void showUserInfo() {
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다.");
		System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다.");
	}
	
}
