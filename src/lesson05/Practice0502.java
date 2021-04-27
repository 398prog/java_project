package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0502 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電話番号と誕生月を入力してください");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = reader.readLine();
		String str2 = reader.readLine();

		int phone = Integer.parseInt(str1);
		int birth = Integer.parseInt(str2);

		System.out.println("電話番号は"+phone+"です。");
		System.out.println("誕生月は"+birth+"です。");

	}

}
