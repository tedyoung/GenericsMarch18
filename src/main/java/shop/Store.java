package shop;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Store {
  public static void showInventory(List<ClothingPair<Shoe>> lcps) {
//    lcps.add(LocalDate.now());
    for(Object s : lcps) {
      System.out.println(s);
    }
  }
  public static void main(String[] args) {
//    Pair<String> p = new Pair<String>("x", LocalDate.now());
//    Pair<String> p = new Pair<String>("x", "y");
    Pair<String> p = new Pair<>("x", "y");

    String s = p.getLeft();

    ClothingPair<Shoe> ps = new ClothingPair<Shoe>(
        new Shoe("RED", 9), new Shoe("RED", 10));
    System.out.println("pair is matched? " + ps.isMatched());
    ClothingPair<Glove> pg = new ClothingPair<>(
        new Glove("RED", 12),
        new Glove("RED", 12)
    );
    System.out.println("gloves match? " + pg.isMatched());

    System.out.println("glove looks good with shoes? " +
        ps.looksGoodWith(pg.getLeft()));

//    boolean b = ps.looksGoodWith("RED");

    List<ClothingPair<Shoe>> lcps = Arrays.asList(
        new ClothingPair<>(new Shoe("RED", 10), new Shoe("RED", 10))
    );
    showInventory(lcps);

  }
}
