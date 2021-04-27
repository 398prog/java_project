package lesson04;

public class Sample0403{

	public static void main(String[] args) {

		//int型の変数を宣言
		int num1;
		int num2;
		int num3;

		//num1に1を代入
		num1 = 1;

		//num1の値を出力
		System.out.println("変数num1の値は"+num1+"です。");

		num2 = num1;

		//num1の値を代入したnum2を出力
		System.out.println("代入後の変数num2の値は"+num2+"です。");

		num3 = num2 + 1;

		//num2の値に1を加算したnum3を出力
		System.out.println("代入後の変数num3の値は"+num3+"です。");

	}

}
