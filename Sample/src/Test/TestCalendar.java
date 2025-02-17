package Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
    
    public long daysBetween() { // daysBetween()メソッドの定義
            
            //日付の差を求める
            LocalDate date1 =   LocalDateTime.now().toLocalDate(); // toLocalDate()でLocalDate型に変換;
            LocalDate date2 = LocalDate.of(2100, 1, 1);
     
            long daysBetween = ChronoUnit.DAYS.between(date1, date2);
            
           
            return daysBetween;
    }
}
    