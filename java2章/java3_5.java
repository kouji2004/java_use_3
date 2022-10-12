package java2章;

public class java3_5 {
  public static void main(String[] ages) {
    age(100, 90);
    age(80, 70);
  }

  public static void age(int a, int b) {
    int sun = a + b;
    System.out.println(a + "+" + b + "=" + sun);
  }
}

// 実行結果
// 100+90=190
// 80+70=150