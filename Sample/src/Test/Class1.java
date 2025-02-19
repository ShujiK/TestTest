package Test;

import java.time.LocalDateTime;

public class Class1 {

    public static void main(String[] args) {

        Person[] people = {
            new Person("ユウタ", 24),
            new Person("花子", 100)
        };

        for (Person person : people) {
            person.sayHello(LocalDateTime.now().getHour());
        }

        TestCalendar tc = new TestCalendar(); // TestCalendarのインスタンスを作成
        String b5ys = tc.getB5ys(); // getB5ysメソッドを呼び出し、結果をb5ysに格納

       
        long daysBetween = tc.daysBetween(); 
        
        System.out.println("---------------------------------------------------------");
        System.out.println("今日の日付は " + LocalDateTime.now().getMonthValue() + " 月 " + LocalDateTime.now().getDayOfMonth() + " 日です。");
        System.out.println("今日の日付からちょうど5年と一週間前の日付は " + b5ys + " です。"); // b5ysを出力
        System.out.println("本日から2100年1月1日までの日数は " + daysBetween + " 日です。"); // daysBetweenを出力
    }
}