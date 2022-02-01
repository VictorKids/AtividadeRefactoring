import java.util.Enumeration;

public class TextStatement extends Statement {

   public String addStr1(Customer aCustomer){
     return "Rental Record for " + aCustomer.getName() +
      "\n";
   }
  
   public String addStr2(Rental each){
     return "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
   }

   public String addStr3(Customer aCustomer){
     return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
   }

   public String addStr4(Customer aCustomer){
     return "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
   }

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