package java2章;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class java2 {
  public static void main(String[] ages) {
    // Instant i1 = Instant.now();

    // Instant i2 = Instant.ofEpochMilli(31920291332L);
    // long l = i2.toEpochMilli();

    // ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2022, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

    // System.out.println(i1);
    System.out.println("東京" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
    System.out.println("ロンドン" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
    if (z2.isEqual(z3)) {
      System.out.println("これらは同じ瞬間を指す");
    }
  }
}

// Instant = 世界における、ある瞬間の時刻をナノ秒単位で厳密に指し示し、保持する
// ZoneDateTime = 世界における、ある瞬間の時刻をナノ秒単位で厳密に指し示し、保持する
// LocalDateTime = 日常的に使われる[曖昧な日時]を保持する
// Duration = 二つの異なる時刻や日時の期間を保持する
// Period = 二つの異なる時刻や日時の期間を保持する

// 実行結果
// 東京202212
// ロンドン202211
// 同じ瞬間を示す