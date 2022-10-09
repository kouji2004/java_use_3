package java1章;

public class java6 {
  public static void main(String[] ages) {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words)
      System.out.print(w + "->");
  }
}

// 実行結果
// abc->def->ghi->

// 解説
// splitとは = 文字列を[,:]の場所で自動で分割してくれる

// stringクラスのsplit()メソッドを使うと一つの文字列を複数に分割
// できる。例えば上のコードを記述すれば、簡単にカンマかコロンの場所
// で文字列を分割できる