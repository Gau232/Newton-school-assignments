import java.util.Scanner;

public class LinearSearch {

    public static void linearSearch(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println("Element found at index "+ i);
                return;
            }
        }
        // dvkjefvjrgb   vkjrvkrgbvj
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        linearSearch(arr,n,k);
    }

}