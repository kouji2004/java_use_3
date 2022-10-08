package java1章;

import java.util.Scanner;

public class java5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("入力してください > ");
    String text = scanner.nextLine();
    System.out.println(text + "が入力されました");
    scanner.close();
  }
}
