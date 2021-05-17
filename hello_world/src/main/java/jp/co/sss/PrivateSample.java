package jp.co.sss;

public class PrivateSample {

    private String field = "instance field";

    private PrivateSample() {
        System.out.println("called Fuga constructor");
    }

    private void method() {
        System.out.println("called fuga.method()");
    }
}
