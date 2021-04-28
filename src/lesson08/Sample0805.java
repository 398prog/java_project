package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0805 {
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		if(num == 4) {
			//numが4と等しい
			System.out.println("4が入力されました。");
		}
		else if(num == 7){
			//numが7と等しい
			System.out.println("7が入力されました。");
		}else{
			//それ以外
			System.out.println("4と7以外の数字が入力されました。");
		}


		System.out.println("システムを終了します。");
	}
}
