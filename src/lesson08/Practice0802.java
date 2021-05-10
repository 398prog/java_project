package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0802 {
	public static void main(String[] args) throws IOException{
		System.out.println("西暦年を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int y = Integer.parseInt(str);

		if((y % 4) == 0 && (y % 100) != 0) {
			System.out.println("うるう年です。");
		}else if((y % 400) == 0) {
			System.out.println("うるう年です。");
		}

		System.out.println("システムを終了します。");
	}
}