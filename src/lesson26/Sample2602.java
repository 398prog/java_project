package lesson26;

//import文でArrayListを呼び出し
import java.util.ArrayList;
import java.util.List;

public class Sample2602 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//リスト生成
		List<Integer> list = new ArrayList<>();


		//数値をリストに追加
		list.add(45);
		list.add(80);
		list.add(76);
		list.add(56);
		list.add(55);

		//要素数を順番に出力
		for(int value:list) {
			System.out.println(value);
		}

	}

}
