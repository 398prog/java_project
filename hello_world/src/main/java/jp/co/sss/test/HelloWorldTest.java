package jp.co.sss.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import hello.HelloWorld;
import jp.co.sss.Employee;
import jp.co.sss.MockTest;
import jp.co.sss.PrivateSample;
import jp.co.sss.SampleUtil;
import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class) // ①モックを動かす宣言(クラスパス指定ができている場合は不要)
public class HelloWorldTest {

     @Mocked // ②モック化するクラスに指定するアノテーション
     private HelloWorld mockTarget;

     private static final String EXPECTED_STR = "Mock";

     @Test
     public void HelloWorldクラスのgetFixStrメソッドの返却文字列を置き換える_1() throws Exception {

        // ③Mockを定義
        new Expectations() {
            {
                mockTarget.getFixStr();
                result = EXPECTED_STR; // ④実行結果を差し替える
            }
        };

        final String actual = mockTarget.getFixStr();

        // ⑤実行結果が差し替えた内容に変わっているかを検証する
        assertEquals(EXPECTED_STR, actual);
        final List<String> actualLst = mockTarget.getArrayList();

        // ⑥差し替えしていないメソッドはモックのデフォルト値が返却される(コレクションの場合は空)
        assertEquals(0, actualLst.size());
    }

     @SuppressWarnings("static-access")
     @Test
     public void SampleUtilクラスを1度だけモック化する(@Mocked SampleUtil sampleUtil) throws Exception {

        // ①テストケースクラスフィールドにて@Mockedを指定したクラスはモック化されている
        assertEquals(null, mockTarget.getFixStr());
        // ②引数で指定したクラスがモック化されている(インスタンス以外の情報もモック化されている)
        assertEquals(null, sampleUtil.getString());
        // ③staticアクセスした場合も②と同様のクラスがモック化されている
        assertEquals(null, SampleUtil.getString());
     }

     @Injectable
     private Employee employee;

     @Test
     public void Injectableを使用して特定のインスタンスのみをモック化する() throws Exception {

        // ①@Injectableを指定したEmployeeインスタンスはモック化されString型の初期値が出力される
        assertEquals(null, employee.getName());

        // ②モック化されたものではないインスタンスを新たに生成する
        final Employee employeeNoMock = new Employee("システム", "太郎");
        // ③モック化されず指定した文字列が取得できている
        assertEquals("システム太郎", employeeNoMock.getName());
    }

     @Tested
     private Employee nomalEmployee;

     @Test
     public void Testedを使用してテスト対象クラスをインスタンス化する() throws Exception {
         assertEquals("デフォルト太郎", nomalEmployee.getName());
     }

     @Test
     public void MockUpを使用してテスト対象メソッドを置き換える() throws Exception {

         // ①methodToTestのメソッドのみを実装する
         final MockTest mockTest = new MockUp<MockTest>() {
             @Mock
             public String methodToTest() {
                 return "hoge";
             }
         }.getMockInstance();

         // ②モック化したメソッドを実行する
         assertEquals("hoge", mockTest.methodToTest());
     }

     @Test
     public void 記録した通りにメソッドを実行していないので失敗する() throws Exception {

         // ①hogeと言う文字列を指定して#getParameterを呼び出すように記録する
         new Expectations() {{
             mockTarget.getParameter("hoge");
         }};
         // ②記録した通りに呼び出していないのでテストが失敗する
         mockTarget.getParameter("fuge");
     }

     public void 記録した回数を超えてメソッドを実行しているので失敗する() throws Exception {

    	    // ①#getParameterのモックを定義する
    	    new Expectations() {{
    	        mockTarget.getParameter("hoge");
    	        times = 1;  // ②実行回数を1回に決める
    	    }};
    	    // ③2回呼び出しているのでテストが失敗する
    	    mockTarget.getParameter("hoge");
    	    mockTarget.getParameter("hoge");
    	}

     @Test
     public void 記録した複数の戻り値が返却される() throws Exception {

         new Expectations() {{
             mockTarget.getParameter("hoge");
             returns("hogehoge", "fugafuga", "hagahaga"); // ①#returns()の引数に戻り値を指定する
         }};
         // ②1～3回目の呼び出しまで内容が変化している
         assertEquals("hogehoge", mockTarget.getParameter("hoge"));
         assertEquals("fugafuga", mockTarget.getParameter("hoge"));
         assertEquals("hagahaga", mockTarget.getParameter("hoge"));
         // ③3回目以降は3つ目に指定した内容が繰り返される
         assertEquals("hagahaga", mockTarget.getParameter("hoge"));
     }

     @Test(expected = NullPointerException.class)
     public void メソッドの戻り値で例外を送出する() throws Exception {

         new Expectations() {{
             // ①resultフィールドを使うことでメソッドの戻り値を決めることができる
             result = new NullPointerException("意図的に送出しています");
         }};

         // ②記録通りに実行されるのでNullPointerが送出される
         mockTarget.getFixStr();
     }

     @Test
     public void プライベートメソッドアクセス() throws Exception {

         // ①インスタンスの生成もDeencapsulationクラスを使用して生成する
         final PrivateSample sample = Deencapsulation.newInstance(PrivateSample.class);

         // ②privateメソッドに対してアクセスする
         Deencapsulation.invoke(sample, "method");
         // ③privateフィールドに対して値を設定する
         Deencapsulation.setField(sample, "field", "field change value.");

         // ④privateフィールドの値を取得する
         final String actual = Deencapsulation.getField(sample, "field");
         assertEquals("field change value.", actual);
         System.out.println(actual);
     }



}

