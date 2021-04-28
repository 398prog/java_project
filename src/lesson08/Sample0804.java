package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0804 {
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		if(num <= 8) {
			//numが8より大きい
			System.out.println(num+"は8以下の数字です。");
		}
		else {
			//resの値が10以下
			System.out.println(num+"は8より大きい数字です。");
		}


		System.out.println("システムを終了します。");
	}
}
