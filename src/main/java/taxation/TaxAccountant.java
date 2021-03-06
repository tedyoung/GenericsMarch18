package taxation;

import java.util.Arrays;
import java.util.List;

public class TaxAccountant {
  public static void collectIndividualCustomers(List<? super Individual> li) {
//  public static void collectIndividualCustomers(List<Individual> li) {
    Individual fred = null;
    li.add(fred); // assignment FROM fred (Individual) to ?
  }

  public static void doTaxes(List<? extends Taxable> l) {
//    Corporation c = null;
//    l.add(c); // Can never be safe!!!
    for (Taxable t : l) { // assignment FROM ? to Taxable
      // ...
    }
  }
  public static void main(String[] args) {
    List<Taxable> lt = Arrays.asList();
    doTaxes(lt);

    List<Individual> li = Arrays.asList();
    doTaxes(li);

    collectIndividualCustomers(li);
    collectIndividualCustomers(lt);
  }
}
