package java1章;

public class java2 {
  public static void main(String[] ages) {
    String s1 = "java and javascript";
    if (s1.contains("java")) {
      System.out.println("文字列s1は javaを含んでいる");
    }
    if (s1.endsWith(("java"))) {
      System.out.println("文字列s1は、javaが末尾にある");
    }
    System.out.println("文字列s1で最初にjavaが登場する位置は" + s1.indexOf("java"));
    System.out.println("文字列s1で最後にjavaが登場する位置は" + s1.lastIndexOf("java"));
  }
}


//問題
//1一部に文字列sを含むかを調べるメソッドとは？　＝  ???
//2文字列sで始まるかを調べる = ???
//3文字列sで終わるかを調べる = ???
//4文字ch(または文字列str)が最初に登場する位置を調べる = ???
//5文字ch(または文字列str)を後ろから検索して最初に登場する位置を調べる = ???




//解答
1
2
3
4
5