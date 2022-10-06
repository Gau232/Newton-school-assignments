import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i]= sc.nextInt();
			}
			Arrays.sort(a);
			int min = a[0]^a[1];
			for(int i=0;i<n-1;i++){
				if((a[i]^a[i+1])<min)
				min=a[i]^a[i+1];
			}
			System.out.println(min);
	}
}