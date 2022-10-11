package java2章;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class java2 {
  public static void main(String[] ages) {
    Instant i1 = Instant.now();

    Instant i2 = Instant.ofEpochMilli(31920291332L);
    long l = i2.toEpochMilli();

    ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2022, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

    System.out.println("東京" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
    System.out.println("ロンドン" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
    System.out.println("同じ瞬間を示す");
  }
}
