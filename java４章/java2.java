package java４章;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class java2 {
  public static void main(String[] ages) {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyy/MM/dd");
    LocalDate d = LocalDate.parse("2022/10/14", f);

    // 100日後を計算する
    d = d.plusDays(1000);
    String str = d.format(f);
    System.out.println("100日後は" + str);

    LocalDate now = LocalDate.now();
    if (now.isAfter(d)) {
      System.out.println("nowはdより新しい");
    }
  }
}
