import javax.swing.JOptionPane;

class CompanyInfo{
   /* Methods():
   * -displayHours(): Returns String of company hours.
   * 
   * Smart Electronics
   * Monday - Friday 8 am to 6 pm
   * Saturday - 8:00am-12pm
   * Sunday - closed
   */

   public static void main (String[] args) { 
      String output = displayHours();
      JOptionPane.showMessageDialog(
         null,
         output
         ); 
   }
   
   public static String displayHours() {
      String output = "Smart Electronics\n" +
                      "Monday - Friday 8 am to 6 pm\n" +
                      "Saturday             8 am to noon\n" +
                      "Sunday                closed";
                      
      return output;
   }                     
}