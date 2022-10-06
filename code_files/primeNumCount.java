import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void primeNumCount(int n){
        boolean[] arr = new boolean[n+1];
        for(int i=0;i<n;i++) {
            arr[i] = true;
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==true){
                for(int j=i+1;j<=n;j=j+i){ //check
                    // if(i%j==0){ // check
                        arr[i]=false;
                    // }
                }    
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){ // check
            if(arr[i]==true){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNumCount(n);
    }
}