import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStringMatches {
    @Test
    public void testStringMatches() {
        print("abc".matches("..."));

        Pattern pattern = Pattern.compile("[a-z]{3}");
        Matcher matcher = pattern.matcher("abc");
        print(matcher.matches());

        print(pattern.pattern());
    }

    public static void print(Object o){
        System.out.println(o);
    }
}
