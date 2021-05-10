package lesson10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1001 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);
		
		if(num < 0) {
			System.out.println(num+"：０未満の値です。");
		}else if(0<num && num < 10) {
			System.out.println(num+":０以上１０未満の値です。");
		}
		
		System.out.println("以上で処理は終了です。");

	}

}
