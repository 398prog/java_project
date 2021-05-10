package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0902 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("整数を入力してください。");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str = read.readLine();
		int num = Integer.parseInt(str);
		int c = num;

		for(int i=0;i<num;i++) {
			for(int j=0;j<c-1;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			c--;
		}

	}

}
