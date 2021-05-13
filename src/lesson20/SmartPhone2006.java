package lesson20;

public class SmartPhone2006 extends Phone2006{
	private int inch;


	public SmartPhone2006() {
		fee = 8000;
		data = 5.0;
		inch = 5;
	}

	public void show() {
		System.out.println("購入したスマートフォンの色は黒です。");
		System.out.println("液晶画面のサイズは"+inch+"インチです。");
		super.show();
	}
}
