package lesson26;

//import文でArrayListを呼び出し
import java.util.ArrayList;
import java.util.List;

public class Sample2601 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//リスト生成
		List<Integer> list = new ArrayList<>();

		//数値をリストに追加
		list.add(1);
		list.add(3);
		list.add(5);

		System.out.println("数値は"+list.get(0)+"です。");

	}

}
