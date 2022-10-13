package java2章;

public class java4_4 {
  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  public static double add(double a, Double b) {
    return a + b;
  }

  public static void main(String[] ages) {
    System.out.println(add(10, 20, 30));
    System.out.println(add(1.2, 2.3));
  }
}

//実行結果
//60
//3.5

//仮引数の型だけではなく、個数が違う場合もオーバーロードできる。