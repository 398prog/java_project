package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0803 {
	public static void main(String[] args) throws IOException{
		System.out.println("[日替わりランチ]\s1:月曜日\s2:火曜日\s3:水曜日");
		System.out.println("気になる日替わりランチの曜日を数字で入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int n = Integer.parseInt(str);

		switch (n) {
		case 1:
			System.out.println("月曜日はカルビ丼です。");
			break;
		case 2:
			System.out.println("火曜日はケチャップオムライスです。");
			break;
		case 3:
			System.out.println("水曜日はカルボナーラです。");
			break;
		}


		System.out.println("システムを終了します。");
	}
}