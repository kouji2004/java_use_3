//問題
//１～10までの整数をカンマで連結した以下の実行結果にせよ
//実行結果を1,2,3,4,5,6,7,8,9,10にしなさい










//解答↓




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
