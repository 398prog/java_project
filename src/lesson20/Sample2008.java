package lesson20;

public class Sample2008 {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Phone2008 p1 = new Phone2008();
		Phone2008 p2 = new Phone2008();

		Phone2008 p3 = p1;

		boolean bl1 = p1.equals(p2);
		boolean bl2 = p1.equals(p3);

		System.out.println("p1とp2が同じオブジェクトか調べた結果："+bl1);
		System.out.println("p1とp3が同じオブジェクトか調べた結果："+bl2);
	}

}
