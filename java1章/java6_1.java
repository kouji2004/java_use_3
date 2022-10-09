package java1章;

public class java6_1 {
  public static void main(String[] ages) {
    String name = "abc,def:ghi";
    String w = name.replaceAll("[beh]", "X");
    System.out.println(w);
  }
}

// 実行結果
// aXc,dXf:gXi

// replaceAllとは
// StringメソッドのreplaceAll()メソッドを使うと、文字列中のパターンに
// 一致しない箇所を別の文字に置換できる。上記の"ben"の文字３文字いずれか
// に当てはまった文字を"X"に置換する。