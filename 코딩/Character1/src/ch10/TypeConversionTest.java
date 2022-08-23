package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 = 20;
		float fNum = iNum1;
		
		System.out.println(iNum);
		
		double dNum = 1.2;
		float ffNum = 0.9F;
		
		int iiNum1 = (int)dNum + (int)ffNum;
		int iiNum2 = (int)(dNum + ffNum);
		
		System.out.println(iiNum1);
		System.out.println(iiNum2);
	}

}
