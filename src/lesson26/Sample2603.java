package lesson26;

import java.util.HashMap;
import java.util.Map;

public class Sample2603 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//HashMapの生成
		Map<String,String> map = new HashMap<>();

		// 要素の追加
		map.put("犬", "dog");
		map.put("猫", "cat");
		map.put("猿", "monkey");

		System.out.println("キー「猿」に該当する要素の値は"+map.get("猿")+"です。");

	}

}
