package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0904 {

	public static void main (String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("いくつ*を出力しますか？");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		for(int i=1;i<=num;i++) {
			System.out.print("*");
		}



	}

}
