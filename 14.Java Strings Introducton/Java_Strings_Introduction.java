import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = sc.next();
        int sum_len = A.length() + B.length();
        System.out.println(sum_len);
        int compare = A.compareTo(B);
        System.out.println(compare);
        if(compare<=0)
        {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1));
    }
    
}
