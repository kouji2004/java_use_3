package java1章;

public class java6 {
  public static void main(String[] ages) {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words)
      System.out.print(w + "->");
  }
}
