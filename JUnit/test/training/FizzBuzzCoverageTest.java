package training;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzCoverageTest {
    @Test
    public void 引数3の場合() {
        // テスト実行
        FizzBuzz fizzBuzz = new FizzBuzz(); // A
        String result = fizzBuzz.doFizzBuzz(3); // B

        // 結果確認
        assertThat(result, is("Fizz")); // C
    }

    @Test
    public void 引数5の場合() {

        // テスト実行
        FizzBuzz fizzBuzz = new FizzBuzz(); // A
        String result = fizzBuzz.doFizzBuzz(5);

        // 結果確認
        assertThat(result, is("Buzz"));
    }

    @Test
    public void 引数15の場合() {

        // テスト実行
        FizzBuzz fizzBuzz = new FizzBuzz(); // A
        String result = fizzBuzz.doFizzBuzz(15);

        // 結果確認
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void それ以外の場合() {

        // テスト実行
        FizzBuzz fizzBuzz = new FizzBuzz(); // A
        String result = fizzBuzz.doFizzBuzz(1);

        // 結果確認
        assertThat(result, is("1"));
    }
}
