package hello;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public final String getFixStr() {
        return "Hello World!!";
    }

    public List<String> getArrayList() {
        return new ArrayList<String>();
    }

    public String getParameter(final String param) {
        return param;
    }
}

