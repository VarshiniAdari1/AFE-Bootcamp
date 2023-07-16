import java.util.*;
public class DigitArrSum {
    
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int arr1[]=new int[n1];
      for(int l=0;l<n1;l++){
        arr1[l]=sc.nextInt();
      }
      int n2=sc.nextInt();
      int arr2[]=new int[n2];
      for(int i=0;i<n2;i++){
        arr2[i]=sc.nextInt();
      }
      int max=n1>n2?n1+1:n2+1;
      int sum[]=new int[max];
       int s=0,c=0;
      int i=n1-1,j=n2-1,k=sum.length-1;
      while(i>=0||j>=0){
        s=c;
        if(i>=0){
            s+=arr1[i];
        }
        if(j>=0){
            s+=arr2[j];
        }
        c=s/10;
        s=s%10;
        sum[k]=s;
        i--;
        k--;
        j--;
      }
      sum[0]=c;
      for(int m=0;m<sum.length;m++){
        if(m==0&&sum[m]==0){
            continue;
        }
        System.out.print(sum[m]+" ");
      }
      sc.close();
    }
    
}
