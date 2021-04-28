package lesson07;

public class Practice0702 {

	public static void main(String[] args) {
		String[] fluits = {"りんご","みかん","いちご","ぶどう"};
		int i;

		for(i=0;i<4;++i) {
			System.out.println((i+1)+"番目の人の点数は"+fluits[i]+"です。");
		}

		System.out.println("果物は全部で"+fluits.length+"つあります。");

	}

}
