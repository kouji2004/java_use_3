package java2章;

public class java4_7 {
  public static int[] makeArray(int size){
    int[] newArray = new int[size];
    for(int i=0; i<newArray.length; i++){
      newArray[i]=i;
    }
    return newArray;
  }
  public static void main(String[]ages){
    int[] array = makeArray(4);
    for(int i:array){
      System.out.println(i);
    }
  }
}

//実行結果
//0
//1
//2
//3