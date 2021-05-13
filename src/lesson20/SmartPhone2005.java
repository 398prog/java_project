package lesson20;

public class SmartPhone2005 extends Phone2005{
	private int inch;


	public SmartPhone2005() {
		System.out.println("スマートフォンを生成しました。");
		inch = 5;
	}

	public void show() {
		System.out.println("液晶画面のサイズは"+inch+"インチです。");
	}
}
