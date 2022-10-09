/*Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats.
where  is  formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).*/

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
      NumberFormat n=NumberFormat.getCurrencyInstance(Locale.US);
       String us=n.format(payment);
      NumberFormat n1=NumberFormat.getCurrencyInstance(Locale.CHINA);
       String china=n1.format(payment);
      NumberFormat n2=NumberFormat.getCurrencyInstance(Locale.FRANCE);
       String france=n2.format(payment);
      NumberFormat n3=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
       String india=n3.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
