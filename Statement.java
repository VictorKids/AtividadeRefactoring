import java.util.Enumeration;

public abstract class Statement {

   public abstract String addStr1(Customer aCustomer);
  
   public abstract String addStr2(Rental each);

   public abstract String addStr3(Customer aCustomer);

   public abstract String addStr4(Customer aCustomer);

   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = addStr1(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += addStr2(each);
      }
      //add footer lines
      result += addStr3(aCustomer);
      result += addStr4(aCustomer);
      return result;
   }

}