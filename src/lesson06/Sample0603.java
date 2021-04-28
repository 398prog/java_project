package lesson06;

public class Sample0603 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;

		num2 = num1++;
		System.out.println("num1の値は" + num1 + "です。");
		System.out.println("num2の値は" + num2 + "です。");


		System.out.println("-------------------------------");

		num2 = ++num1;
		System.out.println("num1の値は" + num1 + "です。");
		System.out.println("num2の値は" + num2 + "です。");


	}

}
