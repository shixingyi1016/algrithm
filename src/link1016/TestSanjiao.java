package link1016;

public class TestSanjiao {
	public static void main(String[] args) {
		//System.out.println(sanjiaoDigui(0));
		System.out.println(FibonacciDigui(1));
		System.out.println(FibonacciDigui(2));
		System.out.println(FibonacciDigui(3));
	}
	public static int sanjiao(int n){
		int a = 0;
		while(n>0){
			a +=n;
			n--;
		}
		return a;
	}
	public static int sanjiaoDigui(int n){
		if(n == 1){
			return 1;
		}else{
			return n+sanjiaoDigui(--n);
		}
	}
	public static int FibonacciDigui(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return FibonacciDigui(n-1)+FibonacciDigui(n-2);
		}
	}

}
