package lesson07;

public class Sample0703 {

	public static void main(String[] args) {
		int[] height1 = {162,177,154,185};

		int[] height2;

		height2 = height1;
		height1[0] = 180;


		System.out.println("一人目の身長は"+height2[0]+"cmです。");
		System.out.println(height1);
	}

}
