import java.util.*;;
public class Java_end_of_file{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int i=1;
        while(sc.hasNext())//It is a Scanner class method which returns true if this scanner has another token in its input. This method may block while waiting for input to scan.
        {
            System.out.printf(i+" %s\n",sc.nextLine());
            i++;
        }
        sc.close();
    }
}