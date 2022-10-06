package java1章;

public class java {
  public static void main(String[]ages){
    String s1 = "すっきりjava";
    String s2 = "java";
    String s3 = "jAva";

    if(s3.equals(s2)){
      System.out.println("一致");
    }
    if(s2.equalsIgnoreCase(s3)){
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
  }
}
