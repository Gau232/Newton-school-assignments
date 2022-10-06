import java.util.Scanner;

// n1+n2/2

// x =  (x+x)/2
// l+r/2

public class BinarySearch {// arr, 0 ,7
    // arr,4,7
    // arr,4,4

    public static void binarySearch(int arr[],int l,int r,int k){  // arr,0,n-1,35

        if(r>=l) {
            int middle = l + (r - l) / 2;
            if (arr[middle] == k) {
                System.out.println("Element found at index " + middle);
                return;
            }
            if (arr[middle] > k) {
                binarySearch(arr, l, middle - 1, k);
            } else {
                binarySearch(arr, middle + 1, r, k);
            }
        }
        else {
            System.out.println("Element not found");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        binarySearch(arr,0,n-1,k);
    }
}