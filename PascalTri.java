
import java.util.*;

public class PascalTri {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val;
        for(int row = 0;row<n;row++){
                val=1;
            for(int col=0;col<=row;col++){
                System.out.print(val+"\t");
                val=val*(row-col)/(col+1);
                
            }
            System.out.println();
        }
        sc.close();
    }
}