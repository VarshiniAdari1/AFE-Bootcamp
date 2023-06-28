import java.util.*;
public class ReverseArr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
         
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] ansArr=reverse1(arr);
        System.out.println("Reversin method 1-->");
        for(int i=0;i<n;i++)
        {
            System.out.println(ansArr[i]);
        }
        reverse2(arr);
        System.out.println("Reversin method 2-->");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }
    public static int[] reverse1(int[] arr)
    {
        int n=arr.length;
        int[] ansArr=new int[n];
        for(int i=0;i<n;i++)
        {
            ansArr[i]=arr[n-i-1];
        }
        return ansArr;
    }
    public static int[] reverse2(int[] arr)
    {
        int n=arr.length;
        
        for(int i=0;i<=n/2;i++)
        {
            int j=n-i-1;
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        return arr;

    }
    
}
