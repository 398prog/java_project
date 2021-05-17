package jp.co.sss;

public interface MockTest {

    /**
     * テスト対象メソッド.<br>
     * メソッドが応答した文字列を返却する。
     *
     * @return {@code String} 文字列
     */
    String methodToTest();
    String methodToNotTest1();
    String methodToNotTest2();
    String methodToNotTest3();
}
