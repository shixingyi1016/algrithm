package link1016;

public class TestDigui {
	public static void main(String[] args) {
		test(0);
	}
	public static void test(int i){
		if(i<5){
			System.out.println("haha"+i);
			test(++i);
			System.out.println("ºó"+i);
		}
	}

}
