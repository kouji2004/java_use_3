package java1章;

public class java4 {
  public static void main(String[] ages) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= 3; i++) {
      sb.append("java");
    }
    String s = sb.toString();
    System.out.println(s);
  }
}

// StringBuilder = 文字列を連続して連結する場合に用いる

// 出力結果(数字のカウントは0123)
// javajavajavajava

// 解説
// ⓵appendメソッドを呼んでバッファに文字列を追加していく（必要に応じた回数を呼び出す）
// ⓶最後に一回だけtoStrin()を呼び完成した連結済みの文字列を取り出す
// ⓷System.out.printlnで出力する