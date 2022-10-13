package java2章;

public class java4_6 {

  public static void main(String[]ages){
    int[] array = {1,2,2};
    incArray(array);
    for(int i:array){
      System.out.println(i);
    }
  }
  public static void incArray(int[] array){
    for(int i = 0; i<array.length; i++){
      array[i]++;
    }
}

}