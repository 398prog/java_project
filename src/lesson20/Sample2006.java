package lesson20;

public class Sample2006 {

		

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final int TEISU_NUM = 1000;
		
		Phone2006[] phones = new Phone2006[2];
		phones[0] = new Phone2006();
		phones[0].fee = TEISU_NUM;

		phones[1] = new SmartPhone2006();

		for(Phone2006 phone : phones) {
			phone.show();
		}
	}

}
