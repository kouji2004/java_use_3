package java2章;

public class java3_3 {
  public static void methodA() {
    System.out.println("AmethodA");
    methodB();
  }

  public static void methodB() {
    System.out.println("methodB");
  }

  // public static void methodC() {
  // System.out.println("methodC");
  // }

  public static void main(String[] ages) {
    methodA();
  }
}

// 実行結果
// Amethod
// methodB


