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

    @Test
    public void testPattern() {
        print("aaa".matches("a.."));//.表示任意字符
        print("aaa".matches("a+"));//一次或者多次
        print("aaa".matches("a?"));//一次或者没有
        print("aaa".matches("a*"));//0次或者多次
        print("".matches("a*"));//空串当然是匹配的
        print("".matches("a?"));//同上
        print("aaaaaa".matches("a{1,3}"));//一次到三次
        print("aaa".matches("a{1,}"));
        print("检测IP地址：");
        //错误的正则表达式
        print("119.29.62.18".matches("//d//d//d//.//d//d//d//.//d//d//d//.//d//d//d"));
    }

    /**
     * 辅助打印函数
     * @param o 要打印的对象
     */
    public static void print(Object o){
        System.out.println(o);
    }
}
