public class lesson {
  public static void main(String[] args) {
    String s1 = "スッキリjava";
    String s2 = "javaaa";
    String s3 = "java";
    String s4 = "";

//文字列が等しいかどうか
    if(s2.equals(s3)){
      System.out.println("s2とs3は等しい");
    }
    //文字列が大文字、小文字区別せず等しいかどうか
    else if(s2.equalsIgnoreCase(s3)){
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    else{
      System.out.println("s2とs3は等しくない");
    }
    //文字列長を調べる
    System.out.println("s1の長さは" + s1.length() + "です");
    if(s4.isEmpty())//空文字かどうか区別
    {
      System.out.println("s4は空文字です");
    }
  }
}
