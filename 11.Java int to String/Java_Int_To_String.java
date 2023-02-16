import java.util.Scanner;

public class Java_Int_To_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Integer Number: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if(n==Integer.parseInt(s))
        {
            System.out.println("Good job");
        }
        else {
            System.err.println("Worng answer .");
        }
    }
    
}
