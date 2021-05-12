package lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1902 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("1つ目の文字列を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();

		System.out.println("2つ目の文字列を入力してください。");
		String str2 = reader.readLine();
		StringBuilder builder = new StringBuilder(str1);

		builder.append(str2);
		System.out.println("2つの文字列をつなげた結果は"+builder+"です。");
	}

}
