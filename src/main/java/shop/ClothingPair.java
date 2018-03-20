package shop;


// "extends" in generics means "is assignment
// compatible with". ie. either is A, or implements.
// Use & for multiple constraints, and put any (single)
// class FIRST
//public class ClothingPair<E extends Object & Sized & Colored , X> extends Pair<E> {
public class ClothingPair<E extends Sized & Colored> extends Pair<E> {
//  X s = "Hello";
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean isMatched() {
    return left.getColor().equals(right.getColor())
        && left.getSize() == right.getSize();
  }
  public <F extends Colored> boolean looksGoodWith(F other) {
    return other.getColor().equals(left.getColor());
  }
  public <F extends Colored> boolean looksGoodWith(F other, F third) {
    return other.getColor().equals(left.getColor());
  }
  public static <E extends Sized & Colored,
      F extends Sized & Colored> boolean matches(E left, E right) {
    return left.getColor().equals(right.getColor())
        && left.getSize() == right.getSize();
  }
}
