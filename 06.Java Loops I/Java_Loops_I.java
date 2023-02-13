import java.util.*;;

public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf(""+N+" x "+i+" = %d %n",+(N*i));
        }

    }
    
}
