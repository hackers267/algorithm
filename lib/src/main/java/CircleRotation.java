public class CircleRotation {

    /**
     * 判断两个值字符串是否互为回环变位
     * @param s String 其中一个字符串
     * @param t String 另一个字符串
     * @return Boolean true:是回环变位；false:不是回环变位
     */
    public static Boolean is(String s, String t) {
        return s.length() == t.length() && (s.concat(s).contains(t));
    }
}
