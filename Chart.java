import java.util.*;
public class Chart {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lgst=arr[0];
        
        for(int i=0;i<n;i++){
            if(arr[i]>lgst){
                lgst=arr[i];
                
           }
        }
        int max=lgst;
        for(int i=0;i<max;i++){
            for(int j=0;j<n;j++){
                if(lgst-arr[j]>0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            lgst--;
            System.out.println();
        }
        
        sc.close();
    }
}

