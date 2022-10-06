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


