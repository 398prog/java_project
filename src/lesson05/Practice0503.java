package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0503 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("西暦を入力してください");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();

		int num = Integer.parseInt(str);
		num += 1;
		System.out.println("来年は"+num+"です。");

	}

}
