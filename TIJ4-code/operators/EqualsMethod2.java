//: operators/EqualsMethod2.java
// Default equals() does not compare contents.

class ValueSS {
  int i;
}

public class EqualsMethod2 {
  public static void main(String[] args) {
    ValueSS v1 = new ValueSS();
    ValueSS v2 = new ValueSS();
    v1.i = v2.i = 100;
    System.out.println(v1.equals(v2));
    // error --> System.out.println(v1.i.equals(v2.i));
    System.out.println(v1.i == v2.i);
  }
} /* Output:
false
*///:~
