package java1章;

public class java3 {
  public static void main(String[] ages) {
    String s1 = "java jaja";
    System.out.println("文字列s1の4文字目以降は" + s1.substring(2));
    System.out.println("文字列s1の4~7文字目以降は" + s1.substring(3, 8));
    System.out.println("文字列s1の4目を気に抜く" + s1.charAt(0));
  }
}

// 指定位置の１文字を切り出す = chatAt
// 指定位置から始まる文字列を任意の長さだけ切り出す = substring

// 出力結果
// 文字列s1の4文字目以降はva jaja
// 文字列s1の4~7文字目以降はa jaj
// 文字列s1の4目を気に抜くj