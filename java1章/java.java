package java1章;

public class java {
  public static void main(String[] ages) {
    String s1 = "";
    String s2 = "java";
    String s3 = "jAva";

    if (s3.equals(s2)) {
      System.out.println("一致");
    }
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です");
    if (s1.isEmpty()) {
      System.out.println("s1は空です");
    }
  }
}

// 内容が等しいか調べる ＝ equals
// 大文字小文字を区別せず内容が等しいか調べる ＝ equalsIgnoreCase
// 文字列長を調べる = length()
// 空文字を調べる = isEmpty()