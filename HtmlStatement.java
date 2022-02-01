import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public String addStr1(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
      }
     
      public String addStr2(Rental each){
        return each.getMovie().getTitle()+ ": " +
        String.valueOf(each.getCharge()) + "<BR>\n";
      }
   
      public String addStr3(Customer aCustomer){
        return "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      }
   
      public String addStr4(Customer aCustomer){
        return "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
      }

   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = addStr1(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += addStr2(each);
      }
      //add footer lines
      result += addStr3(aCustomer);
      result += addStr4(aCustomer);
      return result;
   }
}