package Test;

import java.time.LocalDateTime;

public class Class1 {

    public static void main(String[] args) {

        Person p1 = new Person("タロウ", 8);
        Person p2 = new Person("花子", 100);

        p1.sayHello(LocalDateTime.now().getHour());
        p2.sayHello(LocalDateTime.now().getHour());

        TestCalendar tc = new TestCalendar(); // TestCalendarのインスタンスを作成
        String b5ys = tc.getB5ys(); // getB5ysメソッドを呼び出し、結果をb5ysに格納

        
        System.out.println("---------------------------------------------------------");
        System.out.println("今日の日付は " + LocalDateTime.now().getMonthValue() + " 月 " + LocalDateTime.now().getDayOfMonth() + " 日です。");
        System.out.println("今日の日付からちょうど5年と一週間前の日付は " + b5ys + " です。"); // b5ysを出力
    }
}