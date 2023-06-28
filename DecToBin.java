import java.util.*;
public class DecToBin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int BinNo=0;
        int basePow=1;
        while(n>0){
            int rem = n%2;
            BinNo+=rem*basePow;
            basePow*=10;
            n=n/2;
        }
        System.out.println(BinNo);
        sc.close();
    }
}