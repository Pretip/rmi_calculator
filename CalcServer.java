import java.rmi.Naming;

public class CalcServer {

   public CalcServer() {
     try {
       Calculator c = new CalculatorImpl();
       Naming.rebind("rmi://localhost:1099/CalculatorService", c);
     } catch (Exception e) {
       System.out.println("Trouble: " + e);
     }
   }

   public static void main(String args[]) {
     new CalcServer();
   }
}