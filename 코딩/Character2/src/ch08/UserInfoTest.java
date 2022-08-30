package ch08;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userInfoT = new UserInfo();
		
		userInfoT.height = 180;
		userInfoT.weight = 78;
		userInfoT.gender = "male";
		userInfoT.name = "Tomas";
		userInfoT.age = 37;
		
		userInfoT.showUserInfo();
	}

}
