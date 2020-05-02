package cn.coufran.test.hello;

/**
 * Hello发言者
 * @author coufran
 * @since 1.0.0
 */
public class Hello {
    /**
     * Say Hello
     * @param name Hello name
     * @return Hello word
     */
    public static String say(String name) {
        String word = "Hello, " + name + "!";
        System.out.println(word);
        return word;
    }
}
