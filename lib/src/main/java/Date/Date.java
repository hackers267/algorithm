package Date;

public class Date {
    private static int m;
    private static int d;
    private static int y;

    /**
     * 构建一个年月日的日期对象
     * @param month int 月份
     * @param day int 日
     * @param year int 年份
     */
    public Date(int month, int day, int year) {
        m = month;
        d = day;
        y = year;
    }

    /**
     * 返回当前日
     * @return int 当前日
     */
    public int day() {
        return d;
    }

    /**
     * 返回当前年份
     * @return int 当前年份
     */
    public int year() {
        return y;
    }

    /**
     * 返回当前月份
     * @return int 当前月份
     */
    public int month() {
        return m;
    }

    /**
     * 当前日期的字符串表示
     * @return String 形如： "3/12/2020" 的字符串表示
     */
    public String toString() {
        return m + "/" + d + "/" + y;
    }
}
