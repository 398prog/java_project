package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0901 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		int num =0;
		int sum = 0;

		System.out.println("整数を入力してください。");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//		String str = read.readLine();

		while(num != -1) {

			String str = read.readLine();
			num = Integer.parseInt(str);
			if(num == -1) {
				break;
			}

			sum += num;
		}
		System.out.println("整数の合計値は"+sum+"です。");

	}

}
