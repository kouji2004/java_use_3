package java2章;

public class java4 {
  // 一つ目のaddメソッド
  public static int add(int a, int b) {
    return a + b;
  }

  // 二つ目のaddメソッド
  public static double add(double a, double b) {
    return a + b;
  }

  // 三つ目のaddメソッド
  public static String add(String a, String b) {
    return a + b;
  }

  public static void main(String[] ages) {
    System.out.println(add(10, 20));
    System.out.println(add(21.1, 32.2));
    System.out.println(add("オーバーロード", "について勉強"));

  }
}

// 実行結果
// 30
// 53.300000000000004
// オーバーロードについて勉強

// 仮引数が異なれば同じメソッド(add)が複数あったとしても、仮引数(int,double,String)が異なっていれば、jvmが呼び出し元の引数を見て
// その引数の型に一致するメソッドを呼び出してくれる。