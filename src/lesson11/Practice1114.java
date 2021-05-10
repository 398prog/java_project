package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice1114 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[3];

		System.out.println("plz input 3 numbers");

		for(int i=0;i<3;i++) {
			String str = read.readLine();
			num[i] = Integer.parseInt(str);
		}



		Arrays.sort(num);

		for(int i=0;i<3;i++) {
			System.out.print(num[i]+"\s");
		}

	}

}
