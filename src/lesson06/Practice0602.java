package lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0602 {

	public static void main(String[] args) throws IOException{
		int num1;
		int num2;

		System.out.println("1つ目の数値を入力してください");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = reader.readLine();
		num1 = Integer.parseInt(str1);

		System.out.println("2つ目の数値を入力してください");

		String str2 = reader.readLine();
		num2 = Integer.parseInt(str2);

		int sum = num1 + num2;

		System.out.println("足し算の合計は"+sum+"です。");

	}

}
