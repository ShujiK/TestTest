package Test;

import java.util.Calendar;

public class TestCalendar {

    public String getB5ys() {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.YEAR, -5);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, 0);

        int month = calendar.get(Calendar.MONTH) + 1; // 月は0から始まるので+1する
        String b5ys = calendar.get(Calendar.YEAR) + "年" + month + "月" + calendar.get(Calendar.DATE) + "日";

        return b5ys;
    }
}