package java2章;

public class java3_4 {
  public static void main(String[] ages) {
    System.out.println("点呼を始める");
    age("1");
    age("2");
    age("3");
    age("4");
    System.out.println("終わり!");
  }

  public static void age(String sun) {
    System.out.println(sun);
  }
}

// 実行結果
// 点呼を始める
// 1
// 2
// 3
// 4
// 終わり