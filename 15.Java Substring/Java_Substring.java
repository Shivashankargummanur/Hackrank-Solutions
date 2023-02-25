import java.util.Scanner;
public class Java_Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String S = in.next();
        System.out.print("Enter The Starting Number: ");
        int start = in.nextInt();
        System.out.print("Enter The Ending Number: ");
        int end = in.nextInt();
        System.out.print("The SubString For Given Index Numbers is: "+S.substring(start, end));
        
    }
    
}
