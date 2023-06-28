public class DecToOct {
    public static void main(String args[]){
        int n=798;
        int OctNo=0;
        int place=1;
        int rem=0;
        while(n>0){
            rem=n%8;
            OctNo+=rem*place;
            place*=10;
            n/=8;
        }
        System.out.println(OctNo);
    }
    
}
