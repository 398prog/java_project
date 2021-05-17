package lesson25;

public class Practice2501 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//人間クラスのオブジェクトを生成
		Human2501 human = new Human2501();

		human.setName("tanaka");

		//例外処理
		try {
			//名前の文字数を出力
			System.out.println(human.getName().length());
		}catch(Exception e) {
			System.out.println("ERROR!");
		}finally {
			System.out.println("終了します。");
		}

	}

}
