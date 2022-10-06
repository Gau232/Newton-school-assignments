class Main {
     static void nthprimedigitsnumber(long n)
    {
        //finding the length of n-th nthprimedigitsnumber
        long len = 1;

        // count of numbers with len-1 digits
        long prev_count = 0;
        while (true) {
            // count of numbers with i digits
            long curr_count = (long)(prev_count+Math.pow(4,  len));

            // if i is the length of such numbers
    if (prev_count < n && curr_count >= n)
    break;

    len++;
    prev_count = curr_count;
        }
        for(int i =1; i <= len; i++){
            for(long j = 1; j <=4; j++) {
                if (prev_count + Math.pow(4, len - i) < n)
                prev_count +=Math.pow(4, len - i);
                else{
                    if (j == 1)
                    System.out.print("2");
                    else if (j == 2)
                    System.out.print("3");
                    else if (j == 3)
                    System.out.print("5");
                    else if (j == 4)
                    System.out.print("7");
                    break;
                }
            }
        }
        System.out.println();
    }


public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n =sc.nextInt();
        nthprimedigitsnumber(n);
    }
}



}