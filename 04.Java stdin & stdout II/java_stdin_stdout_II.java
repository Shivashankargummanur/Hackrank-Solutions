import java.util.*;

public class java_stdin_stdout_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();
        
       
        // Write your code here.

        System.out.println("String: "+s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
    
}
