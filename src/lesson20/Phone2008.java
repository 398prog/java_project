package lesson20;

public class Phone2008 {
	protected int fee;
	protected double data;

	public Phone2008() {
		fee = 0;
		data = 0.0;
		System.out.println("携帯電話を購入しました。");
	}

	public void setPhone(int f,double d) {
		fee = f;
		data = d;
		System.out.println("料金は"+fee+"円でデータ通信量は"+data+"GBです。");
	}


	//override
//	public String toString() {
//		String str = "料金：" + fee +"データ通信量：" + data;
//		return str;
//	}
}
