import java.util.Scanner;

class Fibonacci{

	public static int fib(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		int firstNum = 0;
		int secondNum = 1;
		for(int i=2; i<=n; i++){
			int total = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = total;
		}
		return secondNum;

	}
	public static void main(String... args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			System.out.print(fib(i)+" ");
		}
	}
}
