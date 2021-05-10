package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0801 {
	public static void main(String[] args) throws IOException{
		System.out.println("性別を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		char[] c = str.toCharArray();

		if(c[0] == 'M') {
			System.out.println("性別を男性で登録しました。");
		}else{
			System.out.println("性別を女性で登録しました。");
		}

		System.out.println("システムを終了します。");
	}
}