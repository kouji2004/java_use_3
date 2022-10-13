package java2章;

public class java4_5 {
  public static void addArray(int[]array){
    for(int eleme : array){
      System.out.println(eleme);
    }
  }
  public static void main(String[]ages){
    int[] array = {1,2,3};
     addArray(array);
  }
}

//実行結果
//1
//2
//3
