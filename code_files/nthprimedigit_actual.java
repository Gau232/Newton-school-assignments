public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int testcase=sc.nextInt();
	
	for(int i=0;i<testcase;i++){
	int inp=sc.nextInt();
	System.out.println(npnumber(inp));
	}

}

static String npnumber(int number){
	int rem;
	String num="";

	while (number>0) {
		rem = number % 4;

		switch (rem) {

			case 1:
			num+='2';
			break;

			case 2:
			num+='3';
			break;

			case 3:
			num+='5';
			break;

			case 0:
			num+='7';
			break;
		}

		if (number % 4 == 0)
			number--;
			number = number / 4;
	}
	return new StringBuilder(num).reverse().toString();

}