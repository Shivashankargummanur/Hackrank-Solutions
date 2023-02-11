import java.util.*;


class java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number Of Series You Want: ");
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){

            
            System.out.print("Enter The A value: ");
            int a = in.nextInt();
            System.out.print("Enter The B value: ");
            int b = in.nextInt();
            System.out.print("Enter The N value: ");
            int n = in.nextInt();
            int pervious = 0;
            int sum;
            for(int j=0;j<n;j++)
            {

                int pow = (int) Math.pow(2, j);
                if(j==0)
                {
                    sum = a + pow * b;
                }
                else {
                    sum = pow * b;
                }
                int series = sum + pervious;
                System.out.println(series);
                pervious = series;
            }
            System.out.println("");
            
        }
        in.close();
    }
}
