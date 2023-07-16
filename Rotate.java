import java.util.*;
public class Rotate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5};
        int r=sc.nextInt();
        int n=arr.length;
        if(r>0){
            if(r>=n){
                r%=n;
            }
        }
        else{
            r=r%n+n;
        }
        
    
    reverse(arr,0,(n-r-1));
    reverse(arr,(n-r),(n-1));
    reverse(arr, 0, (n-1));
    printArr(arr,0,(n-1));
    
    sc.close();
    } 

public static void printArr(int[] arr,int sIndx, int eIndx){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
public static void reverse(int arr[],int sIndx,int eIndx){
    while(sIndx<eIndx){
        int tmp=arr[sIndx];
        arr[sIndx]=arr[eIndx];
        arr[eIndx]=tmp;
        sIndx++;
        eIndx--;
    }
    // printArr(arr,sIndx,eIndx);
    return;
}
}
