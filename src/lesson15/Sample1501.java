package lesson15;

public class Sample1501 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Phone1501 phone = new Phone1501();

		phone.setFee(1000);
		phone.setData(2.0);

		System.out.println("エラーデータ用");

		phone.setFee(-10000);
		phone.setData(9999.99);
	}

}
