import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException;
import java.util.Scanner; 
 
public class CalcClient { 
 
    public static void main(String[] args) { 
        System.out.println("MENU");
        System.out.println("");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for divition");
        System.out.println("");
        System.out.println("Enter your choice");
        
        Scanner sc = new Scanner(System.in);
        try { 
            Calculator c = (Calculator)
                           Naming.lookup(
                 "rmi://localhost/CalculatorService"); 
            int choice = sc.nextInt();
            int a,b;
            switch(choice){
                case 1:{
                    System.out.println("Enter the first value");
                    a=sc.nextInt();
                    System.out.println("Enter the second value");
                    b=sc.nextInt();
                    System.out.println("Answer is : "+c.add(a, b));
                    break;
                }
                case 2:{
                    System.out.println("Enter the first value");
                    a=sc.nextInt();
                    System.out.println("Enter the second value");
                    b=sc.nextInt();
                    System.out.println("Answer is : "+c.sub(a, b));
                    break;
                }
                case 3:{
                    System.out.println("Enter the first value");
                    a=sc.nextInt();
                    System.out.println("Enter the second value");
                    b=sc.nextInt();
                    System.out.println("Answer is : "+c.mul(a, b));
                    break;
                }
                case 4:{
                    System.out.println("Enter the first value");
                    a=sc.nextInt();
                    System.out.println("Enter the second value");
                    b=sc.nextInt();
                    System.out.println("Answer is : "+c.div(a, b));
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}