package java1章;

public class 練習問題 {
  public static void main(String[] ages) {
    StringBuilder lesson = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      lesson.append(i + 1).append(",");
    }
    String s = lesson.toString();
    System.out.println(s);
  }
}
