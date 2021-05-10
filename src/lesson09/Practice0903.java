package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0903 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("整数を入力してください。");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str = read.readLine();
		int num = Integer.parseInt(str);
		int c = 0;

		for(int i=1;i<=num;i++) {
			if((num % i) == 0) {
				c++;
			}
		}

		if(c == 2) {
			System.out.println("入力された整数は素数です。");
		}else {
			System.out.println("入力された整数は素数ではありません。");
		}
	}

}
